package newfeature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * 常见操作：
 * 1.Intermediate：
 * 		map (mapToInt, flatMap 等)、 filter、 distinct、 sorted、 peek、 limit、 skip、 parallel、 sequential、 unordered
 * 2.Terminal：
 * 		forEach、 forEachOrdered、 toArray、 reduce、 collect、 min、 max、 count、 anyMatch、 allMatch、 noneMatch、 findFirst、 findAny、 iterator
 * 3.Short-circuiting：
 * 		anyMatch、 allMatch、 noneMatch、 findFirst、 findAny、 limit
 * Created by Rocky on 2018-12-06.
 */
public class StreamDemo02 {

	public static void main(String[] args) {
		/*
		 * 1.map/flapMap: 它的作用就是把 input Stream 的每一个元素，映射成 output Stream 的另外一个元素。
		 */
		List<String> wordList = Arrays.asList("a", "b", "c");
		List<String> output = wordList.stream()
//				.map(e -> e.toUpperCase())
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(output);
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		List<Integer> squareNums = nums.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(squareNums);
		
		//一对多
		Stream<List<Integer>> inputStream = Stream.of(
				Arrays.asList(1),
				Arrays.asList(2, 3),
				Arrays.asList(4, 5, 6)
				);
		Stream<Integer> outputStream = inputStream.flatMap(childList -> childList.stream());
		outputStream.forEach(System.out::println);
		
		/*
		 * 2.filter: filter 对原始 Stream 进行某项测试，通过测试的元素被留下来生成一个新 Stream。
		 */
		Integer[] sixNums = {1, 2, 3, 4, 5, 6};
		List<Integer> evens = Stream.of(sixNums).filter(x -> x%2 == 0).collect(Collectors.toList());
		System.out.println(evens);
	
		/*
		 * 3.forEach: forEach 方法接收一个 Lambda 表达式，然后在 Stream 的每一个元素上执行该表达式。 
		 * 		forEach 不能修改自己包含的本地变量值，也不能用 break/return 之类的关键字提前结束循环。
		 */
		// Java 8
/*		roster.stream()
		 .filter(p -> p.getGender() == Person.Sex.MALE)
		 .forEach(p -> System.out.println(p.getName()));
		// Pre-Java 8
		for (Person p : roster) {
		 if (p.getGender() == Person.Sex.MALE) {
		 System.out.println(p.getName());
		 }
		}*/
		
		Stream<Integer> stream = Stream.of(1, 2, 3);
		stream.forEach(System.out::println);
		//报错：forEach 是 terminal 操作，因此它执行后，Stream 的元素就被“消费”掉了，你无法对一个 Stream 进行两次 terminal 运算。
		//相反，具有相似功能的 intermediate 操作 peek 可以达到上述目的
//		stream.forEach(i -> System.out.println(i));
		Stream.of("one", "two", "three", "four")
		 .filter(e -> e.length() > 3)
		 .peek(e -> System.out.println("Filtered value: " + e))
		 .map(String::toUpperCase)
		 .peek(e -> System.out.println("Mapped value: " + e))
		 .collect(Collectors.toList());
		
	}
}
