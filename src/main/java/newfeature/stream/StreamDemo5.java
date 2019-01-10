package newfeature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Rocky on 2018-12-10.
 */
public class StreamDemo5 {

	public static void main(String[] args) {
		/*
		 * limit/skip: limit 返回 Stream 的前面 n 个元素；skip 则是扔掉前 n 个元素（它是由一个叫 subStream 的方法改名而来）。
		 */
		List<Person> persons = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			Person person = new Person(i, "name" + i);
		    persons.add(person);
		}
		List<String> personNames = persons.stream().map(Person::getName).limit(10).skip(3).collect(Collectors.toList());
		System.out.println(personNames);
		/*
		 * 这是一个有 10，000 个元素的 Stream，但在 short-circuiting 操作 limit 和 skip 的作用下，管道中 map 操作指定的 getName() 方法的执行次数为 limit 所限定的 10 次，
		 * 而最终返回结果在跳过前 3 个元素后只有后面 7 个返回。
		 */
		
		System.out.println("----------------------------------华丽分割线----------------------------------------------------");
		/*
		 *  有一种情况是 limit/skip 无法达到 short-circuiting 目的的，就是把它们放在 Stream 的排序操作后，原因跟 sorted 这个 intermediate 操作有关：
		 *  此时系统并不知道 Stream 排序后的次序如何，所以 sorted 中的操作看上去就像完全没有被 limit 或者 skip 一样。
		 */
		List<Person> persons2 = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			 Person person = new Person(i, "name" + i);
			 persons2.add(person);
		}
		List<Person> personList2 = persons2.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).limit(2).collect(Collectors.toList());
		System.out.println(personList2);
		/*
		 * 即虽然最后的返回元素数量是 2，但整个管道中的 sorted 表达式执行次数没有像前面例子相应减少。
		 */
		
		System.out.println("----------------------------------华丽分割线----------------------------------------------------");
		/*
		 * sorted: 对 Stream 的排序通过 sorted 进行，它比数组的排序更强之处在于你可以首先对 Stream 进行各类 map、filter、limit、skip 
		  *  甚至 distinct 来减少元素数量后，再排序，这能帮助程序明显缩短执行时间
		 */
		List<Person> personList3 = persons2.stream().limit(2).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
		System.out.println(personList3);
		/*
		  *  当然，这种优化是有 business logic 上的局限性的：即不要求排序后再取值。
		 */
	}
	
	private static class Person {
		private int no;
		private String name;
		public Person(int no, String name) {
			this.no = no;
			this.name = name;
		}
		
		public String getName() {
			System.out.println(name);
			return name;
		}

		@Override
		public String toString() {
			return "Person [no=" + no + ", name=" + name + "]";
		}
	}
}
