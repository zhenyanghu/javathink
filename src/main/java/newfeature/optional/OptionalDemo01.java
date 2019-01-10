package newfeature.optional;

import java.util.Optional;

/**
 * Created by Rocky on 2018-12-25.
 */
public class OptionalDemo01 {

	public static void main(String[] args) {
		// of
		Optional<String> ofOptional = Optional.of("张三");
//		Optional<String> nullOptional1 = Optional.of(null); // NPE
		
		// ofNullable
		Optional<String> nullOptional2 = Optional.ofNullable(null);
		System.out.println("ofNullable: " + nullOptional2);
		Optional<String> nullOptional3 = Optional.ofNullable("lisi");
		System.out.println("ofNullable: " + nullOptional3);
		
		// empty
		Optional<String> emptyOptional = Optional.empty();
		
		// get
		Optional<String> stringOptional1 = Optional.of("张三");
		System.out.println("get: " + stringOptional1.get());
		Optional<String> emptyOptional2 = Optional.empty();
//		System.out.println(emptyOptional2.get()); // 如果我们创建的Optional对象中有值存在则返回此值，如果没有值存在，则会抛出 NoSuchElementException异常。
		
		// orElse  如果创建的Optional中有值存在，则返回此值，否则返回一个默认值
		Optional<String> optional1 = Optional.of("张三");
		System.out.println("orElse: " + optional1.orElse("zhangsan"));
		
		Optional<String> optional2 = Optional.empty();
		System.out.println("orElse: " + optional2.orElse("李四"));
		
		// orElseGet 如果创建的Optional中有值存在，则返回此值，否则返回一个由Supplier接口生成的值
		Optional<String> optional3 = Optional.of("张三");
		System.out.println("orElseGet: " + optional3.orElseGet(() -> "zhangsan"));
		
		Optional<String> optional4 = Optional.empty();
		System.out.println("orElseGet: " + optional4.orElseGet(() -> "lisi"));
		
		// orElseThrow
		Optional<String> optional5 = Optional.of("张三");
		System.out.println("orElseThrow: " + optional5.orElseThrow(CustomException::new));

		Optional<String> optional6 = Optional.empty();
		System.out.println("orElseThrow: " + optional6.orElseThrow(CustomException::new));
		
		
	}
	private static class CustomException extends RuntimeException {
		   private static final long serialVersionUID = -4399699891687593264L;

		   public CustomException() {
		       super("自定义异常");
		   }

		   public CustomException(String message) {
		      super(message);
		   }
	}

	
}
