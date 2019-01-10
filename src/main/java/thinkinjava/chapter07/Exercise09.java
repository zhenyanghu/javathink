package thinkinjava.chapter07;

public class Exercise09 {

	public static void main(String[] args) {
		Stem.main(args);
	}
	
}

class Root {
	//任意变量得初始化都再任意方法之前，先静态后非静态
	private Component1 component1 = new Component1();
	private Component2 component2 = new Component2();
	private Component3 component3 = new Component3();
	public Root() {
		System.out.println("Root");
	}
}

class Component1 {
	public Component1() {
		System.out.println("Component1");
	}
}

class Component2 {
	public Component2() {
		System.out.println("Component2");
	}
}

class Component3 {
	public Component3() {
		System.out.println("Component3");
	}
}

class Stem extends Root {
	public Stem() {
		System.out.println("Stem");
	}
	public static void main(String[] args) {
		Stem stem = new Stem();
		
	}
}
