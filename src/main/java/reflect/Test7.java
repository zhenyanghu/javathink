package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射来调用类中的方法
 * @author Rocky
 *
 */
public class Test7 {

	public static void main(String[] args) throws ClassNotFoundException, SecurityException,
			NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Class<?> clazz = Class.forName("reflect.Test7");
		Method method1 = clazz.getMethod("reflect1");
		method1.invoke(clazz.newInstance());
//		Method method2 = clazz.getMethod("reflect2",  Integer.class, String.class);
		Method method2 = clazz.getMethod("reflect2",  int.class, String.class);//应该是int.class，方法名和参数列表的类型来获取方法
		method2.invoke(clazz.newInstance(), 20, "张三");//对应和参数列表
		//getMethod只能调用得到public的方法，如果要得到private的方法，需要调用getDeclaredMethod方法，如：
		/*Method setTemp = clazz.getDeclaredMethod("setTemp", double.class);
		setTemp.setAccessible(true);//允许访问
		WeatherData data = (WeatherData) clazz.newInstance();*/
		
	}
	public void reflect1() {
		System.out.println("Java 反射机制 - 调用某个类的方法1");
	}
	public void reflect2(int age, String name) {
		 System.out.println("Java 反射机制 - 调用某个类的方法2");
	     System.out.println("age -> " + age + ". name -> " + name);
	}
}
