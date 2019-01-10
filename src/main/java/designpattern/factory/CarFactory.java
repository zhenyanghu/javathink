package designpattern.factory;

public class CarFactory extends VihecleFactory {

	public Moveable create() {
		return new Car();
	}
}
