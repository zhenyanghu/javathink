package netty.echo;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * @Author: Rocky
 * @Date: 2020/5/25
 * @Description:
 */
public class EchoServer {

    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public void start() throws InterruptedException {
        final EchoServerHandler serverHandler = new EchoServerHandler();
        // 线程组
        EventLoopGroup group = new NioEventLoopGroup();

        try {
            // 服务端启动必须
            ServerBootstrap b = new ServerBootstrap();
            b.group(group) // 将线程组传入
                    .channel(NioServerSocketChannel.class) // 指定使用NIO进行网络传输
                    .localAddress(new InetSocketAddress(port)) // 指定服务监听端口
                    /* 服务端每收到一个连接请求，就会新启一个socket通信，也就是channel，
                       所以，下面这段代码的作用就是这个 子channel增加handler */
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            // 添加该子channel的pipeline的尾部
                            ch.pipeline().addLast(serverHandler);
                        }
                    });
            ChannelFuture f = b.bind().sync(); // 异步绑定到服务器，sync()会阻塞知道完成
            f.channel().closeFuture().sync(); // 阻塞知道服务器的channel关闭
        } finally {
            group.shutdownGracefully().sync(); // 优雅关闭线程组
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int port = 9999;
        EchoServer echoServer = new EchoServer(port);
        System.out.println("服务器即将启动");
        echoServer.start();
        System.out.println("服务器关闭");
    }
}
