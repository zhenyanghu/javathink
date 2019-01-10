package othertest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Rocky on 2018/3/15.
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            Runnable r = new Runnable() {
                public void run() {
                    Thread t = Thread.currentThread();
                    System.out.println(t + "正在执行任务");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(t + "执行任务完毕");
                }
            };
            threadPool.execute(r);
            System.out.println("将任务交给线程池");
        }

        threadPool.shutdown();
        System.out.println("关闭线程池");
    }
}
