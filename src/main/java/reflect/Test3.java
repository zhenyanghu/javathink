package reflect;

public class Test3 {

	/**
	 * 获取一个类的父类和实现接口
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("reflect.Demo");
		Class<?> superClazz = clazz.getSuperclass();
//		System.out.println(clazz.getGenericSuperclass());
		System.out.println(superClazz.getName());
		Class[] interFaces = clazz.getInterfaces();
		for(Class c : interFaces) {
			System.out.println(c.getName());
		}
	}
}
