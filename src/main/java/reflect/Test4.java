package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test4 {

	/**
	 * 获取所有的构造函数，根据构造函数来实例化对象
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = Class.forName("reflect.User");
		Object obj = clazz.newInstance();//默认构造器实例话对象
		User user = (User) obj;
		user.setName("张三");
		user.setAge(24);
		System.out.println(user);
		Constructor<?>[] cons = clazz.getConstructors();
		System.out.println("----");
		for(int i = 0; i < cons.length; i++) {
			System.out.print("constructor[" + i +"](");
			Class<?>[] pTypes = cons[i].getParameterTypes();
			for(int j = 0; j < pTypes.length; j++) {
				if(j == pTypes.length - 1)//为最后一个参数是，不用拼“,”
					System.out.print(pTypes[j].getName());
				else
					System.out.print(pTypes[j].getName() + ", ");
			}
			System.out.print(")");
			System.out.println();
		}
		User user1 = (User) cons[0].newInstance("李明", 20);
		System.out.println(user1);
		User user2 = (User) cons[1].newInstance("李四");
		System.out.println(user2);
		User user3 = (User) cons[2].newInstance();
		System.out.println(user3);
	}
}

class User {
	private String name;
	private int age;
	
	public User() {
		super();
	}
	
	public User(String name) {
		super();
		this.name = name;
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}