package newfeature.stream;

import newfeature.stream.StreamDemo7.Person;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Rocky on 2018-12-10.
  *  进阶：自己生成流
 */
public class StreamDemo8 {

	public static void main(String[] args) {
		/*
		 * Stream.generate :
		  *  通过实现 Supplier 接口，你可以自己来控制流的生成。这种情形通常用于随机数、常量的 Stream，或者需要前后元素间维持着某种状态信息的 Stream。
		  *  把 Supplier 实例传递给 Stream.generate() 生成的 Stream，默认是串行（相对 parallel 而言）但无序的（相对 ordered 而言）。
		  *  由于它是无限的，在管道中，必须利用 limit 之类的操作限制 Stream 大小。
		 */
		//生成 10 个随机整数
		Random seed = new Random();
		Supplier<Integer> random = seed::nextInt;
//		Supplier<Integer> random = () -> seed.nextInt();
		Stream.generate(random).limit(10).forEach(System.out::println);
		//Another way
		IntStream.generate(() -> (int) (System.nanoTime() % 100)).limit(10).forEach(System.out::println);
		
		/*
		 * Stream.generate() 还接受自己实现的 Supplier。例如在构造海量测试数据的时候，用某种自动的规则给每一个变量赋值；
		  *  或者依据公式计算 Stream 的每个元素值。这些都是维持状态信息的情形。
		 */
		Stream.generate(new PersonSupplier()).limit(10)
				.forEach(p -> System.out.println(p.getName() + ", " + p.getAge()));
		
		/*
		 * Stream.iterate : iterate 跟 reduce 操作很像，接受一个种子值，和一个 UnaryOperator（例如 f）。
		  *  然后种子值成为 Stream 的第一个元素，f(seed) 为第二个，f(f(seed)) 第三个，以此类推。
		 */
		//生成一个等差数列
		Stream.iterate(0, n -> n + 3).limit(10).forEach(x -> System.out.print(x + " "));
		/*
		  * 与 Stream.generate 相仿，在 iterate 时候管道必须有 limit 这样的操作来限制 Stream 大小。
		 */
		
		
		/*
		  * 用 Collectors 来进行 reduction 操作
		 */
		//首先生成 100 人的信息，然后按照年龄归组，相同年龄的人放到同一个 list 中
		Map<Integer, List<Person>> personGroups = Stream.generate(new PersonSupplier())
				.limit(10).collect(Collectors.groupingBy(Person::getAge));
		Iterator<Entry<Integer, List<Person>>> it = personGroups.entrySet().iterator();
		while (it.hasNext()) {
			 Entry<Integer, List<Person>> persons = (Entry) it.next();
			 System.out.println("Age " + persons.getKey() + " = " + persons.getValue().size());
		}
		Map<Boolean, List<Person>> children = Stream.generate(new PersonSupplier())
				.limit(10).collect(Collectors.groupingBy(p -> p.getAge() < 18));
		System.out.println("Children number: " + children.get(true).size());
		System.out.println("Adult number: " + children.get(false).size());


	}
	static class PersonSupplier implements Supplier<Person> {
		private int index = 0;
		private Random random = new Random();
		@Override
		public Person get() {
			return new Person(index++, "StormTestUser" + index, random.nextInt(100));
		}
	}	
	
		 
}
