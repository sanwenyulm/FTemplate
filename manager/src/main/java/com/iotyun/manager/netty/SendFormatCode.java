package com.iotyun.manager.netty;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
//读位操作指令  1  2；
//写位操作指令 5
//读寄存器指令 3  4；
//写寄存器指令6
//写多位寄存器 16


//[设备地址] [命令号03] [起始寄存器地址高8位]  [低8位]      [读取的寄存器数高8位] [低8位]      [CRC校验的低8位] [CRC校验的高8位]
//
//
//==================
//
// 读位操作 
//
//==================
//
// 写位操作 
//[设备地址] [命令号05] [输出bit位高8位]  [低8位]      [控制命令高8位] [低8位]      [CRC校验的低8位] [CRC校验的高8位]
//
//==================
//
// 写地址操作 
//
//[设备地址] [命令号06] [起始寄存器地址高8位]  [低8位]      [写高8位] [低8位]      [CRC校验的低8位] [CRC校验的高8位]
public class SendFormatCode {
	boolean debug = true;
	private static SendFormatCode instancde;
	byte[] order_base =  { (byte) 0x01, (byte)0x01,  (byte) 0x00, (byte) 0x00,(byte)  0x00, (byte) 0x00,(byte)  0x00, (byte) 0x00};
	private boolean readOne = true;
	private boolean readBit = true;
    
	public boolean isReadOne() {
		return readOne;
	}
	public void setReadOne(boolean readOne) {
		this.readOne = readOne;
	}
	public boolean isReadBit() {
		return readBit;
	}
	public void setReadBit(boolean readBit) {
		this.readBit = readBit;
	}


	Channel ctx;
	
	SendFormatCode(Channel ctx){
		this.ctx = ctx;
	}
	public static SendFormatCode getInstance(Channel ctx){
		if(instancde == null){
			instancde = new SendFormatCode(ctx);
		}
		return instancde;
	}
	
	//读寄存器
	public void sendRegisterRead(int addrStart,int readOffset){
		//读寄存器指令 3
		order_base[1] = (byte)0x03;
		//读开始地址
		order_base[2] =   (byte)((addrStart>>8) & 0xff);
		order_base[3] =   (byte)(addrStart & 0xff);
		//要读的寄存器个数
		order_base[4] =   (byte)((readOffset>>8) & 0xff);
		order_base[5] =   (byte)(readOffset & 0xff);
		
		addCRC(order_base);
		
		dump();
        //向dtu发送指令
	    ctx.writeAndFlush(Unpooled.wrappedBuffer(order_base));
	}
	
	//写寄存器
	public void sendRegisterWrite(int addrStart,int value){
		//写寄存器指令 6
		order_base[1] = (byte)0x06;
		//写入开始地址
		order_base[3] =   (byte)(addrStart & 0xff);
		order_base[2] =   (byte)((addrStart>>8) & 0xff);
		//写入寄存器的数
		order_base[5] =   (byte)(value & 0xff);
		order_base[4] =   (byte)((value>>8) & 0xff);
		
		addCRC(order_base);
		
		dump();
		//向dtu发送指令
		ctx.writeAndFlush(Unpooled.wrappedBuffer(order_base));
	}
	//读开关量
	public void sendBitRead(int addrStart,int readOffset){
		//读位指令 1
		order_base[1] = (byte)0x01;
		//读开始地址
		order_base[3] =   (byte)(addrStart & 0xff);
		order_base[2] =   (byte)((addrStart>>8) & 0xff);
		//要读的位个数
		order_base[5] =   (byte)(readOffset & 0xff);
		order_base[4] =   (byte)((readOffset>>8) & 0xff);
		
		addCRC(order_base);
		
		dump();
		//向dtu发送指令
		ctx.writeAndFlush(Unpooled.wrappedBuffer(order_base));
	}
	
	//写开关量
	public void sendBitWrite(int addrStart,boolean open){
		//写位指令 5
		order_base[1] = (byte)0x05;
		//写入开始地址
		order_base[3] =   (byte)(addrStart & 0xff);
		order_base[2] =   (byte)((addrStart>>8) & 0xff);
		//写入位的数
		if(open){
			order_base[5] =   (byte)0x00;
			order_base[4] =   (byte)0xff;
		}else{
			order_base[5] =   (byte)0x00;
			order_base[4] =   (byte)0x00;
		}

		
		addCRC(order_base);
		
		dump();
		//向dtu发送指令
		ctx.writeAndFlush(Unpooled.wrappedBuffer(order_base));
	}
	
 /**
  * 计算CRC16校验码
  *
  * @param bytes
  * @return
  */
 public void  addCRC(byte[] bytes) {
     int CRC = 0x0000ffff;
     int POLYNOMIAL = 0x0000a001;

     int i, j;
     for (i = 0; i < bytes.length-2; i++) {//当前数组后两位是CRC码
         CRC ^= ((int) bytes[i] & 0x000000ff);
         for (j = 0; j < 8; j++) {
             if ((CRC & 0x00000001) != 0) {
                 CRC >>= 1;
                 CRC ^= POLYNOMIAL;
             } else {
                 CRC >>= 1;
             }
         }
     }
     
     bytes[bytes.length-1] = (byte)((CRC>>8) & 0xff);
     bytes[bytes.length-2] = (byte)(CRC & 0xff);   
}

 /**
  * 4位字节数组转换为整型
  * @param b
  * @return
  */
 public  int byte2Int(byte[] b) {
     int intValue = 0;
     for (int i = 0; i < b.length; i++) {
         intValue += (b[i] & 0xFF) << (8 * (3 - i));
     }
     return intValue;
 }
 public void dump(){
	 if(!debug) return;
 	Date d = new Date();
 	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
 	String dateNowStr = sdf.format(d);
	 System.out.println("********************pre-code:"+dateNowStr +"↓**********************");
	 int  i =0;
	 for (i = 0; i < order_base.length; i++) {
		 System.out.print(order_base[i]);
		 System.out.print(" ");
     }
	 System.out.println("*********************pre-code ↑*********************");
 }
}
