package thinkinjava.chapter09;

public class Exercise18 {

	public static void consumerGetCycle(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		consumerGetCycle(new BicycleFactory());
		consumerGetCycle(new UnicycleFactory());
		consumerGetCycle(new TricycleFactory());
	}
}

interface Cycle {
	void ride();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {

	@Override
	public void ride() {
		System.out.println("独轮车");
	}
}

class Bicycle implements Cycle {

	@Override
	public void ride() {
		System.out.println("自行车");
	}
	
}

class Tricyle implements Cycle {

	@Override
	public void ride() {
		System.out.println("三轮车");
	}
	
}

class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}
	
}

class BicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Bicycle();
	}
	
}

class TricycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Tricyle();
	}
	
}
