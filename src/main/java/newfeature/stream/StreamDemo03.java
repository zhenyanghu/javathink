package newfeature.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Rocky on 2018-12-06.
 */
public class StreamDemo03 {

	public static void main(String[] args) {
		/*
		 * findFirst: 这是一个 termimal 兼 short-circuiting 操作，它总是返回 Stream 的第一个元素，或者空。
		 * 		这也是一个模仿 Scala 语言中的概念，作为一个容器，它可能含有某值，或者不包含。这里比较重点的是它的返回值类型：Optional
		 */
		String strA = " abcd ", strB = null;
		print(strA);
		print("");
		print(strB);
		getLength(strA);
		getLength("");
		getLength(strB);
		
		System.out.println(Stream.of(1, 2, 3).findFirst().get());
		
	}
	
	public static void print(String text) {
		// Java 8
		Optional.ofNullable(text).ifPresent(System.out::println);
		// Pre-Java 8
		if (text != null) {
			System.out.println(text);
		}
	}
	
	public static int getLength(String text) {
		// Java 8
		return Optional.ofNullable(text).map(String::length).orElse(-1);
		// Pre-Java 8
		// return if (text != null) ? text.length() : -1;
	};
}
