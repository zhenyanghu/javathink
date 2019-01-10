package thinkinjava.chapter05;

public class Exercise20 {

	public static void main(String[] args) {
		//调用类Other的main()方法
		Other.main(new String[]{"one", "two", "three"});
	}
}

class Other {
	public static void main(String[] args) {
		for(String s : args) {
			System.out.println(s);
		}
	}
}
