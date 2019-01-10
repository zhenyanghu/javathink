package designpattern.factory;

public class PlaneFactory extends VihecleFactory {

	public Moveable create() {
		return new Plane();
	}
}
