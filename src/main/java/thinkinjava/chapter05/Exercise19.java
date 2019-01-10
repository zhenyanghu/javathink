package thinkinjava.chapter05;

public class Exercise19 {

	static void f(String... args) {
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String str = "\"a\",\"b\",\"c\"";
		f(str);
		f("a","b","c");
		String[] num = {"one", "two", "three"};
		f(num);
	}
}
