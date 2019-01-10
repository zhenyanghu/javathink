package newfeature.lambda;

import java.util.function.Predicate;

/**
 * Created by Rocky on 2018-12-26.
 */
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> predicate = (x) -> x.length() > 0;
		System.out.println(predicate.test("String"));
	}
}
