package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test5 {

	/**
	 * 获取一个类的全部属性
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("reflect.User");
		Field[] fields =  clazz.getDeclaredFields();
		for(int i = 0; i < fields.length; i++) {
			//修饰符
			int mo = fields[i].getModifiers();
			String moType = Modifier.toString(mo);
			//类型
			Class<?> type = fields[i].getType();
			System.out.println(moType + " " + type.getName() + " " + fields[i].getName());
		}
	}
}
