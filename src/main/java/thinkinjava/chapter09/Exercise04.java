package thinkinjava.chapter09;

public class Exercise04 {

	public static void main(String[] args) {
		E e = new E();
		System.out.println("创建对象"+e);
		e.f(e);
		
	}
}

abstract class D {
	public abstract void g(D e);
}

class E extends D {
	public void f(D e) {
		g(e);
	}

	@Override
	public void g(D e) {
		// TODO Auto-generated method stub
		
	}

}