package newfeature.lambda;

import java.util.function.Consumer;

/**
 * Created by Rocky on 2018-12-26.
 */
public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> consumer1 = (x) -> System.out.println(x);
		Consumer<String> consumer2 = (x) -> {
			System.out.println(" after consumer 1");
		};
		consumer1.andThen(consumer2).accept("test consumer1");
	}
}
