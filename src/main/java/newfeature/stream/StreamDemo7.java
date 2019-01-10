package newfeature.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rocky on 2018-12-10.
 */
public class StreamDemo7 {

	public static void main(String[] args) {
		/*
		 * Match: Stream 有三个 match 方法，从语义上说：
		 * allMatch：Stream 中全部元素符合传入的 predicate，返回 true
		 * anyMatch：Stream 中只要有一个元素符合传入的 predicate，返回 true
		 * noneMatch：Stream 中没有一个元素符合传入的 predicate，返回 true
		 */
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "name" + 1, 10));
		persons.add(new Person(2, "name" + 2, 21));
		persons.add(new Person(3, "name" + 3, 34));
		persons.add(new Person(4, "name" + 4, 6));
		persons.add(new Person(5, "name" + 5, 55));
		boolean isAllAduit = persons.stream().allMatch(p -> p.getAge() > 18);
		System.out.println(isAllAduit);
		boolean isThereAnyChild = persons.stream().anyMatch(p -> p.getAge() < 12);
		System.out.println(isThereAnyChild);
		
		
	}
	
	public static class Person {
		private int no;
		private String name;
		private int age;
		public Person(int no, String name, int age) {
			this.no = no;
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			System.out.println(name);
			return name;
		}
		
		public int getAge() {
			return age;
		}

		@Override
		public String toString() {
			return "Person [no=" + no + ", name=" + name + ", age=" + age + "]";
		}

	}
}
