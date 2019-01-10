package newfeature.lambda;

import java.util.function.Function;

/**
 * Created by Rocky on 2018-12-26.
 */
public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, String> function1 = (x) -> "test result: " + x;
		
		Function<String, String> function2 = (x) -> {
			return "after function1: " + x;
		};

		System.out.println(function1.apply(5));
		System.out.println(function1.andThen(function2).apply(6));
		
	}
}
