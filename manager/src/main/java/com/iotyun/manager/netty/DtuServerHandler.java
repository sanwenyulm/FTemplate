package com.iotyun.manager.netty;

import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.CharsetUtil;
import io.netty.util.concurrent.GlobalEventExecutor;
//@Sharable
public class DtuServerHandler extends ChannelInboundHandlerAdapter{

    private ChannelPromise promise;
    private ByteBuf response;
    protected Channel currentChannel;
 
   public DtuServerHandler(){
	   System.out.println("DtuServerHandler created @"+this);
   }
	public ByteBuf  getResponse() {
		return response;
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
    	System.out.println(ctx.channel().id()+"channelActive");
    	currentChannel = ctx.channel();
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		System.out.println(ctx.channel().id()+"channelInactive");
		ConnectManager.getInstance().removeDeviceSn(ctx.channel().id());
		
		currentChannel = null;
	}

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		System.out.println(ctx.channel().id()+"handlerAdded");
		ConnectManager.getInstance().addChannel(ctx.channel());
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		System.out.println(ctx.channel().id()+"handlerRemoved");
	}

	@Override
    public void channelRead(ChannelHandlerContext context, Object msg) {
		
		SocketAddress mSocketAddress = context.channel().remoteAddress();
		System.out.println(context.channel().id()+"channelRead"+mSocketAddress.toString());
    	Date d = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
    	String dateNowStr = sdf.format(d);
    	System.out.println("============================Begin Rx At:"+dateNowStr);
        ByteBuf in = (ByteBuf) msg;
        System.out.println("server received UTF_8: " + in.toString(CharsetUtil.UTF_8));
        System.out.println("server received BYTE: ");
        
        String who = in.toString(CharsetUtil.UTF_8);
		if(who.length() == 16){
			ConnectManager.getInstance().putOnLineDeviceSn(who, context.channel().id(),this);
			System.out.println("==============================End===========================");
			return;
		}
		if(who.length() == 1 || who.length() == 2){
			System.out.println("来自"+context.channel().id()+"的心跳包。");
			System.out.println("==============================End===========================");
			return;
		}
		System.out.println("==============================开始处理DTU返回response数据===========================");
		//开始处理DTU返回response数据
		if(promise != null){
			response = in;
			promise.setSuccess();
		}

        System.out.println("==============================End===========================");
       // context.write(in);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
    	System.out.println(ctx.channel().id()+"channelReadComplete");

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext context, Throwable couse) {
        couse.printStackTrace();
        context.close();
    }

    public ChannelPromise sendMessage(ByteBuf message) {
    	response = null;
        if (currentChannel == null)
            throw new IllegalStateException();
        promise = currentChannel.writeAndFlush(message).channel().newPromise();
        return promise;
    }
    
}