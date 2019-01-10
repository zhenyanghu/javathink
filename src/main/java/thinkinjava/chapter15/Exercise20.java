package thinkinjava.chapter15;

public class Exercise20 implements Exercise20Inter {

	@Override
	public void f() {
		System.out.println("调用f()方法");
	}

	@Override
	public void g() {
		System.out.println("调用g()方法");
	}
	
	public void doSome() {
		System.out.println("调用do()方法");
	}

	public static void main(String[] args) {
		Exercise20Other.main(args);
	}
}

class Exercise20Other {	
	public <T extends Exercise20Inter> void dodo(Exercise20Inter ei) {
		ei.f();
		ei.g();
	}
	
	public static void main(String[] args) {
		Exercise20Other e = new Exercise20Other();
		e.dodo(new Exercise20());
	}
}

