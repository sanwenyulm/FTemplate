package com.iotyun.manager.netty;

import java.net.InetSocketAddress;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class DtuServer {

    private final int port;

    public DtuServer(int port) {
        this.port = port;
    }

    public static void beginReciveDtuData() throws Exception {
        System.err.println("Usage: " + DtuServer.class.getSimpleName() + "<port>");
        int port = 8999;
        System.err.println("Usage: " + DtuServer.class.getSimpleName() + 8999);
        new DtuServer(port).start();
        
       
    }

    public void start() throws Exception{
        final DtuServerHandler serverHandler = new DtuServerHandler();
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            // 是否启用心跳保活机机制
            b.childOption(ChannelOption.SO_KEEPALIVE, true);   
            b.group(group).channel(NioServerSocketChannel.class)
             .localAddress(new InetSocketAddress(port)).childHandler(new ChannelInitializer<SocketChannel>() {
                @Override
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    socketChannel.pipeline().addLast(new DtuServerHandler());
                }
            });
            ChannelFuture future = b.bind().sync();
            if(future.isSuccess()){
                System.out.println("TCP服务启动 成功---------------");
            }
            //future.channel().closeFuture().sync();
        } catch(Exception e) {
            group.shutdownGracefully().sync();
        }
    }
}