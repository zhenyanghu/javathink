package thinkinjava.chapter07;

public class Exercise05 {
	
	public static void main(String[] args) {
		C c = new C();
		//System.out.println(c);
	}
	
}

class A {
	public A() {
		System.out.println("wucan");
	}
	public A(int i) {
		System.out.println("A constructor"+i);
	}
}

class B extends A {
	private String b;
	public B(int i) {
		super();
		System.out.println("B constructor"+i);
		b = "haha";
	}
/*	public String toString() {
		return b;
	}*/
}

class C extends B {
	private B b;
	public C() {
		super(5);
		System.out.println("C constructor");
		
	}
/*	public String toString() {
		return b.toString();
	}*/
}