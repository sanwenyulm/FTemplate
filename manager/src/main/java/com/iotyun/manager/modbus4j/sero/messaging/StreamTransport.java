package com.iotyun.manager.modbus4j.sero.messaging;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.iotyun.manager.netty.DtuServerHandler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelPromise;

/**
 * First, instatiate with the streams. Then add a data consumer, or create a message control and pass this as the
 * transport (which will make the message control the data consumer). Change the read delay if desired. This class
 * supports running in its own thread (start) or an external one (run), say from a thread pool. Both approaches are
 * delegated to the stream listener. In either case, stop the transport with the stop method (or just stop the message
 * control).
 *
 * @author Matthew Lohbihler
 * @version 5.0.0
 */
public class StreamTransport implements Transport, Runnable {

    private DtuServerHandler mDtuServerHandler;
    private DataConsumer consumer;
    /**
     * <p>Constructor for StreamTransport.</p>
     *
     * @param in a {@link java.io.InputStream} object.
     * @param out a {@link io.netty.channel.Channel} object.
     */
    public StreamTransport(DtuServerHandler mDtuServerHandler) {
        this.mDtuServerHandler = mDtuServerHandler;
    }


    /** {@inheritDoc} */
    public void setConsumer(DataConsumer consumer) {
        //listener = new InputStreamListener(in, consumer);
    	this.consumer = consumer;
    }


    /**
     * <p>write.</p>
     *
     * @param data an array of {@link byte} objects.
     * @throws java.io.IOException if any.
     */
    public boolean write(byte[] data,int timeout) throws IOException {
    	ChannelPromise promis = mDtuServerHandler.sendMessage(Unpooled.wrappedBuffer(data));
    	try {
			promis.await(timeout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    	
    	ByteBuf in = mDtuServerHandler.getResponse();
    	if(in != null&&in.readableBytes()>2){
    		System.out.printf("收到正常返回数据");
        	byte[] buf = new byte[in.readableBytes()];
        	int index = 0;
        	while(in.isReadable()){
        		buf[index++] = in.readByte();
        	}
        	consumer.data(buf, index/*index 此时的index就是数组长度*/);
        	return true;
    	}
    	return false;

    }
//
//    /** {@inheritDoc} */
//    public void write(byte[] data, int len) throws IOException {
//        out.write(data, 0, len);
//        out.flush();
//    }


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeConsumer() {
		// TODO Auto-generated method stub
		
	}
}
