package reflect;

import java.lang.reflect.Field;

/**
 * 通过反射来操作类中的属性
 * @author Rocky
 *
 */
public class Test8 {
	
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("reflect.User");
		User user = (User) clazz.newInstance();
		Field field = clazz.getDeclaredField("name");
		field.setAccessible(true);
		field.set(user, "李四");
		Field field2 = clazz.getDeclaredField("age");
		field2.setAccessible(true);
		field2.set(user, 27);
		System.out.println(field2.get(user));//获取属性
		System.out.println(user);
	}
}
