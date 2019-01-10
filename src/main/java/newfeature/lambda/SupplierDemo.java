package newfeature.lambda;

import java.util.function.Supplier;

/**
 * Created by Rocky on 2018-12-26.
 */
public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> supplier1 = () -> "Test supplier";
		System.out.println(supplier1.get());
		
		Supplier<Integer> supplier2 = () -> {
			return 20;
		};
		System.out.println(supplier2.get() instanceof Integer);
	}
}
