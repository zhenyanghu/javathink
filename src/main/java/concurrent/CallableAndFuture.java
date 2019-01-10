package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Rocky on 2018-12-03.
 */
public class CallableAndFuture {

	public static void main(String[] args) throws Exception {
		ExecutorService exetutor = Executors.newSingleThreadExecutor();
//		Future<String> future = exetutor.submit(new Callable<String>() {//接受一上callable实例
//
//			@Override
//			public String call() throws Exception {
//				return "MOBIN";
//			}
//		});
		Future<String> future = exetutor.submit(() -> "MOBIN");
		System.out.println("任务的执行结果:" + future.get());
	}
}
