package designpattern.sigleton;

import java.util.ArrayList;
import java.util.List;

public class Car {
  
	public static final int NUM = 5;
	private Car() {}
	private static Car car = new Car();
	private static List<Car> cars = new ArrayList<Car>();//多例
	public static Car getInstance() {
		return car;
	}
	static {
		for(int i = 0; i < NUM; i++ ) {
			cars.add(new Car());
		}
	}
	//多例
	public synchronized static Car getInstance2() {
		
		car = cars.remove(0);
		return car;
	}
	
//	public static Car getIn
	public static void main(String[] args) {
		Car c1 = Car.getInstance2();
		Car c2 = Car.getInstance2();	
		Car c3 = Car.getInstance2();
		Car c4 = Car.getInstance2();	
		Car c5 = Car.getInstance2();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c1 == c2);
		
	}
}
