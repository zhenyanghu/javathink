package enumdemo.inter;

public class C implements A,B {

	public static void main(String[] args) {
		new C().hello();
	}
}

interface A {
	default void hello() {
		System.out.println("Hello world from A");
	}
}

interface B extends A {
	default void hello() {
		System.out.println("Hello world from B");
	}
}
