package newfeature.optional;

import java.util.Optional;

/**
 * Created by Rocky on 2018-12-25.
 */
public class OptionalDemo02 {

	public static void main(String[] args) {
		/*
		 *  filter 如果创建的Optional中的值满足filter中的条件，则返回包含该值的Optional对象，否则返回一个空的Optional对象
		 *  注意: Optional中的filter方法和Stream中的filter方法是有点不一样的，Stream中的filter方法是对一堆元素进 
		 *	行过滤，而Optional中的filter方法只是对一个元素进行过滤，可以把Optional看成是最多只包含一个元素 
		 *	的Stream。
		 */
		Optional<String> stringOptional = Optional.of("zhangsan");
		System.out.println("filter: " + stringOptional.filter(e -> e.length() > 5).orElse("王五"));
		stringOptional = Optional.empty();
		System.out.println("filter: " + stringOptional.filter(e -> e.length() > 5).orElseGet(() -> "王五"));
		
		// 转换值
		// map方法执行传入的lambda表达式参数对Optional实例的值进行修改,修改后的返回值仍然是一个Optional对象
		Optional<String> stringOptional2 = Optional.of("zhangsan");
		System.out.println("map: " + stringOptional2.map(e -> e.toUpperCase()));

		// 返回的结果仍然是一个Optional对象，经过map值转换之后的Optional对象，
//		String s = null;

		String str = Optional.of("zhangsan").map(e -> e = null).orElse("lisi");
		System.out.println("--test--" + str);

		// orElse: Optional中存在值则返回此值，否则，返回默认值
//		stringOptional = Optional.empty();
		stringOptional = Optional.ofNullable("hehehe");
		System.out.println("map: " + stringOptional.map(e -> e.toUpperCase()).orElse("失败"));
		
		//flapMap
		// map方法中的lambda表达式返回值可以是任意类型，在map函数返回之前会包装为Optional。 
		// 但flatMap方法中的lambda表达式返回值必须是Optionl实例，flatMap不会对结果用Optional封装。
		Optional<String> stringOptional3 = Optional.of("zhangsan");
		System.out.println("flapMap: " + stringOptional3.flatMap(e -> Optional.of("lisi")));
		
		stringOptional = Optional.empty();
		System.out.println("flapMap: " + stringOptional.flatMap(e -> Optional.empty()).orElse("失败"));
		
		// ifPresent 方法的参数是一个Consumer的实现类，Consumer类包含一个抽象方法，该抽象方法对传入的值进行处理，只处理没有返回值。
		Optional<String> stringOptional4 = Optional.of("zhangsan");
		stringOptional4.ifPresent(e -> System.out.println("ifPresent: " + "我被处理了。。。" + e));
		
		System.out.println("Test idea git");
	}
}
