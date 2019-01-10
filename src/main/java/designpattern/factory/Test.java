package designpattern.factory;

public class Test {

	public static void main(String[] args) {
//		CarFactory cf = new CarFactory();
//		Car car = cf.createCar();
//		car.run();
//		PlaneFactory pf = new PlaneFactory();
//		Plane plane = pf.createPlane();
//		plane.run();
		VihecleFactory vf = new BroomFactory();
		Moveable m = vf.create();
		m.run();
	}
}
