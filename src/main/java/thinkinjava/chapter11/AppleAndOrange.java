package thinkinjava.chapter11;

import java.util.ArrayList;

public class AppleAndOrange {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i=0; i<3; i++)
			apples.add(new Apple());
		//apples.add(new Orange());
		for(int i=0; i<apples.size(); i++)
			System.out.println(((Apple)apples.get(i)).id());
		Apple.main(args);
	}
}

class Apple {
	private static long counter;
	private final long id = counter++;
	private final int a = 1;
	public long id() {
		return id;
	}
	public static void main(String[] args) {
		System.out.println(new Apple().id());
		System.out.println(new Apple().id());
		
	}
}

class Orange {
	
}

