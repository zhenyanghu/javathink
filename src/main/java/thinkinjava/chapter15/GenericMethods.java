package thinkinjava.chapter15;

public class GenericMethods {

	public <K, E> void f(String x, K y, E z) {
		System.out.println(x.getClass().getName());
		System.out.println(y.getClass().getName());
		System.out.println(z.getClass().getName());
	}
	
	public static void main(String[] args) {
		GenericMethods g = new GenericMethods();
//		g.f("");
//		g.f(1);
//		g.f(1.0);
//		g.f(1.0f);
//		g.f('c');
//		g.f(g);
		g.f("", 1, 1.0);
	}
}
