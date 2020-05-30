package netty.echo;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;

/**
 * @Author: Rocky
 * @Date: 2020/5/25
 * @Description:
 */
public class EchoClient {

    private final int port;
    private final String host;

    public EchoClient(int port, String host) {
        this.port = port;
        this.host = host;
    }

    public void start() throws InterruptedException {
        // 线程组
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            // 客户端启动必备
            Bootstrap b = new Bootstrap();
            b.group(group) // 把线程组传入
                    .channel(NioSocketChannel.class) // 指定NIO进行网络传输
                    .remoteAddress(new InetSocketAddress(host, port))
                    .handler(new EchoClientHandler());
            // 连接远程节点，阻塞直到连接完成
            ChannelFuture f = b.connect().sync();
            // 阻塞程序，知道Channel发生关闭
            f.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully().sync(); // 优雅关闭线程组
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new EchoClient(9999, "127.0.0.1").start();
    }
}
