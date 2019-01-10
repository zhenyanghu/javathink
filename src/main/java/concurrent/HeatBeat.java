package concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Rocky on 2018-12-01.
 */
public class HeatBeat {
	
	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
//		Runnable task = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("HeatBeat...............");
//			}
//		};
		Runnable task = () -> System.out.println("HeatBeat.............."); 
		executor.scheduleAtFixedRate(task, 5, 3, TimeUnit.SECONDS);//5秒后第一次执行，之后每3秒执行一次
	}
	
}
