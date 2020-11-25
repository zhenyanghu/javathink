package delay;

import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.TimerTask;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Rocky
 * @Date: 2020/7/16
 * @Description:
 */
public class Test1 {

    public static void main(String[] args) {

        HashedWheelTimer timer = new HashedWheelTimer(100, TimeUnit.MILLISECONDS, 512);

        TimerTask task = new TimerTask() {
            @Override
            public void run(Timeout timeout) throws Exception {
                System.out.println("任务执行");
            }
        };

        timer.newTimeout(task, 1, TimeUnit.SECONDS);
    }
}
