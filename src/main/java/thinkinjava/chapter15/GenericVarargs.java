package thinkinjava.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 展示java.util.Arrays.asList()方法相同的功能
 * @author Rocky
 *
 */
public class GenericVarargs {

	public static <T> List<T> makeList(T... args) {
		List<T> result = new ArrayList<T>();
		for (T t : args) {
			result.add(t);
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls = makeList("A", "B", "C");
		System.out.println(ls);
		ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
		System.out.println(ls);
		Arrays.asList("A");
	}
}
