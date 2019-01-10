package designpattern.factory;

public class BroomFactory extends VihecleFactory {

	@Override
	public Moveable create() {
		return new Broom();
	}

}
