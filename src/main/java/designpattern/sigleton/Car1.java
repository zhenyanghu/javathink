package designpattern.sigleton;

public class Car1 {
	
	private Car1() {}
	private static Car1 car;
	/**
	 * 有并发安全问题 加synchronized变为同步方法
	 * @return
	 */
	public static Car1 getInstance() {
		if(car == null) {
			car = new Car1();
		}
		return car;
	}
	public synchronized static void main(String[] args) {
		Car1 c1 = Car1.getInstance();
		Car1 c2 = Car1.getInstance();
		System.out.println(c1 == c2);
	}

}
