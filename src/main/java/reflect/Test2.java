package reflect;

public class Test2 {

	/**
	 * 实例化class类对象
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c1 = Demo.class;
		Class<?> c2 = new Demo().getClass();
		Class<?> c3 = Class.forName("reflect.Demo");//通常采用这种方式
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
