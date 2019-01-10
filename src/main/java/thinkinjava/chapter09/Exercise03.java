package thinkinjava.chapter09;

public class Exercise03 {

	public static void main(String[] args) {
		B c = new C();
		System.out.println("main方法");
		c.print();
	}
}

abstract class B {
	public abstract void print();
	public B() {
		System.out.println("基类构造方法");
		print();
	}
}

class C extends B {

	private String i = "hello";
	@Override
	public void print() {
		System.out.println(i);
	}
	
}