package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Rocky on 2018-12-01.
 */
public class ThreadPoolTest {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService threadPool = Executors.newCachedThreadPool();//线程池里面的线程数会动态变化，并可以在线程被移除前重用
		for (int i = 0; i < 5; i++) {
			int task = i;//5个任务
//			TimeUnit.SECONDS.sleep(1);
			//接受一个Runnable实例
			threadPool.execute(() -> System.out.println("线程的名字： " + Thread.currentThread().getName() + ", 任务名为：" + task));
		}
	}
}
