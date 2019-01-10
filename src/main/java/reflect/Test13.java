package reflect;

/**
 * 将反射应用到简单工程模式
 * @author Rocky
 *
 */
public class Test13 {

	public static void main(String[] args) throws Exception {
		Fruit fruit = fruitFactory.getInstance("reflect.Orange");
		fruit.eat();
	}
}

interface Fruit {
	void eat();
}

class Apple implements Fruit {
	@Override
	public void eat() {
		System.out.println("apple");
	}
}

class Orange implements Fruit {

	@Override
	public void eat() {
		System.out.println("orange");
	}
	
}

class fruitFactory {
	public static Fruit getInstance(String className) throws Exception {
		return (Fruit) Class.forName(className).newInstance();
	}
}