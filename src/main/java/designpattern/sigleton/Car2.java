package designpattern.sigleton;

public class Car2 {

	private Car2() {}
	//使用volatile保证多线程访问的时候实例的可见性
	private volatile static Car2 car;
	public static Car2 getInstance() {
		if(car == null) {
			synchronized (Car2.class) {
				if (car == null) {
					car = new Car2();					
				}
			}
		}
		return car;
	}
}
