package newfeature.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Rocky on 2018-11-21.
 */
public class Demo4 {

	public static void main(String[] args) {
		List<Person> javaProgrammers = new ArrayList<Person>() {  
			  {  
			    add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));  
			    add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));  
			    add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));  
			    add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));  
			    add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));  
			    add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));  
			    add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));  
			    add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));  
			    add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));  
			    add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));  
			  }  
			};  
			  
		List<Person> phpProgrammers = new ArrayList<Person>() {  
			  {  
			    add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));  
			    add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));  
			    add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));  
			    add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));  
			    add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));  
			    add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));  
			    add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));  
			    add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));  
			    add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));  
			    add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));  
			  }  
			};  
			
		System.out.println("所有人的名字:");
		javaProgrammers.forEach((java) -> {
			System.out.printf("%s %s %n", java.getFirstName(), java.getLastName());
		});
		phpProgrammers.forEach((php) -> System.out.printf("%s %s %n", php.getFirstName(), php.getLastName()));
		
		System.out.println("加薪5%~ ~ ~ ~ ~ ~ ~");
		Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() * 5/100 + e.getSalary());
		javaProgrammers.forEach(giveRaise);
		phpProgrammers.forEach(giveRaise);
		
		System.out.println("下面是月薪超过 $1,400 的PHP程序员:");
		phpProgrammers.stream()
			.filter(p -> p.getSalary() > 1400)
			.forEach(p -> System.out.printf("%s %s %n", p.getFirstName(), p.getLastName()));
		
		//定义filters
		Predicate<Person> ageFilter = p -> p.getAge() > 25;
		Predicate<Person> salaryFilter = p -> p.getSalary() > 1400;
		Predicate<Person> genderFilter = p -> "female".equals(p.getGender());
		
		//重用filters
		System.out.println("年龄大于 24岁的女性 Java programmers:");  
		javaProgrammers.stream().filter(ageFilter).filter(salaryFilter).filter(genderFilter)
			.forEach(p -> System.out.printf("%s %s %n", p.getFirstName(), p.getLastName()));
		
		System.out.println("最前面的3个 Java programmers:");  
		javaProgrammers.stream().limit(3).forEach(p -> System.out.printf("%s %s %n", p.getFirstName(), p.getLastName()));
		
		System.out.println("最前面的3个女性 Java programmers:");  
		javaProgrammers.stream().filter(genderFilter).limit(3)
			.forEach(p -> System.out.printf("%s %s %n", p.getFirstName(), p.getLastName()));
		
		System.out.println("根据 name 排序,并显示前5个 Java programmers:");  
		List<Person> sortedJavaProgramers = javaProgrammers
				.stream()
				.sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()))
				.limit(5)
				.collect(Collectors.toList());
		sortedJavaProgramers.forEach(p -> System.out.printf("%s %s %n", p.getFirstName(), p.getFirstName()));
		
		System.out.println("根据 salary 排序 Java programmers:");  
		sortedJavaProgramers = javaProgrammers
				.stream()
				.sorted((p1, p2) -> p1.getSalary() - p2.getSalary())
				.limit(5)
				.collect(Collectors.toList());
		sortedJavaProgramers.forEach(p -> System.out.printf("%s %s %n", p.getFirstName(), p.getFirstName()));
		
		System.out.println("工资最低的 Java programmer:");  
		Person pers = javaProgrammers
				.stream()
				.min((p1, p2) -> p1.getSalary() - p2.getSalary())
				.get();
		System.out.printf("Name: %s %s; Salary: $%,d. %n", pers.getFirstName(), pers.getLastName(), pers.getSalary());
			
		System.out.println("工资最高的 Java programmer:");  
		pers = javaProgrammers
				.stream()
				.max((p1, p2) -> p1.getSalary() - p2.getSalary())
				.get();
		System.out.printf("Name: %s %s; Salary: $%,d. %n", pers.getFirstName(), pers.getLastName(), pers.getSalary());
		
		System.out.println("将 PHP programmers 的 first name 拼接成字符串:"); 
		String phpDevelopers = phpProgrammers
				.stream()
				.map(Person::getFirstName)
				.collect(Collectors.joining(" ; "));
		System.out.println(phpDevelopers);
		
		// map：把input stream 里面的每一个元素映射成out stream的另外一个元素
		System.out.println("将 Java programmers 的 first name 存放到 Set:"); 
		Set<String> javaDevFirstName = javaProgrammers
				.stream()
//				.map(Person::getFirstName)
				.map(p -> p.getFirstName())//等同于.map(Person::getFirstName)
				.collect(Collectors.toSet());
		System.out.println(javaDevFirstName);
		
		System.out.println("将 Java programmers 的 first name 存放到 TreeSet:");  
		TreeSet<String> javaDevLastName = javaProgrammers
				.stream()
				.map(Person::getLastName)
//				.collect(Collectors.toCollection(TreeSet::new));
				.collect(Collectors.toCollection(() -> new TreeSet<>()));//等同于.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(javaDevLastName);
		
		System.out.println("计算付给 Java programmers 的所有money:");  
		int totalSalary = javaProgrammers
				.parallelStream()
				.mapToInt(Person::getSalary)
				.sum();
		System.out.println(totalSalary);
		
	}
}
