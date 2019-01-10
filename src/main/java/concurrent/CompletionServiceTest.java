package concurrent;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by Rocky on 2018-12-03.
 */
public class CompletionServiceTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		CompletionService completionService = new ExecutorCompletionService<>(executor);
		for (int i = 0; i < 10; i++) {
			final int result = i;
			completionService.submit(new Callable() {

				@Override
				public Object call() throws Exception {
					Thread.sleep(new Random().nextInt(5000));
					return result;
				}
			});
		}
		System.out.println(completionService.take().get());   //获取执行结果
	}
}
