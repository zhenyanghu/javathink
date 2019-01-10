package newfeature.stream;

import java.util.stream.Stream;

/**
 * Created by Rocky on 2018-12-10.
 */
public class StreamDemo4 {

	public static void main(String[] args) {
		/*
		 * reduce: 这个方法的主要作用是把 Stream 元素组合起来。它提供一个起始值（种子），然后依照运算规则（BinaryOperator），和前
		 * 面 Stream 的第一个、第二个、第 n 个元素组合。从这个意义上说，字符串拼接、数值的 sum、min、max、average 都是特殊的 reduce。例如 Stream 的 sum 就相当于
		 * Integer sum = integers.reduce(0, (a, b) -> a+b); 或 Integer sum = integers.reduce(0, Integer::sum);
		 * 也有没有起始值的情况，这时会把 Stream 的前面两个元素组合起来，返回的是 Optional。
		 */
		// 字符串连接，concat = "ABCD"
		String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
//		String concat = Stream.of("A", "B", "C", "D").reduce("", (s, a) -> s.concat(a));
		System.out.println(concat);
		// 求最小值，minValue = -3.0
		double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
//		double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, (a, b) -> Math.min(a, b));
		System.out.println(minValue);
		// 求和，sumValue = 10, 有起始值
		int sumValue = Stream.of(1, 2, 3, 4).reduce(2, Integer::sum);
		System.out.println(sumValue);
		sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
		System.out.println(sumValue);
		// 过滤，字符串连接，concat = "ace"
		concat = Stream.of("a", "B", "c", "D", "e", "F").filter(x -> x.compareTo("Z") > 0).reduce("", String::concat);
		System.out.println(concat);
		/*
		 * 上面代码例如第一个示例的 reduce()，第一个参数（空白字符）即为起始值，第二个参数（String::concat）为 BinaryOperator。
		 * 这类有起始值的 reduce() 都返回具体的对象。而对于第四个示例没有起始值的 reduce()，由于可能没有足够的元素，返回的是 Optional，请留意这个区别。 
		 */
	}
}
