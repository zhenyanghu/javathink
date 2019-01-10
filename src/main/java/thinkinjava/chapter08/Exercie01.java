package thinkinjava.chapter08;

public class Exercie01 {

	public static void ride(Cycle c, CycleEnum ce) {
		c.play(ce);
	}
	public static void main(String[] args) {
		Unicycle uc = new Unicycle();
		Bicycle bc = new Bicycle();
		Tricycle tc = new Tricycle();
		ride(uc, CycleEnum.UNICYCLE);
		ride(bc,CycleEnum.BICYCLE);
		ride(tc,CycleEnum.TRICYCLE);
	}
}

class Cycle {

	void play(CycleEnum ce) {
		System.out.println("Cycle的play"+ce);
	}
}

class Unicycle extends Cycle {
	void play(CycleEnum ce) {
		System.out.println("UniCycle的play"+ce);
	}
}

class Bicycle extends Cycle {
	void play(CycleEnum ce) {
		System.out.println("BiCycle的play"+ce);
	}
}

class Tricycle extends Cycle {
	void play(CycleEnum ce) {
		System.out.println("TriCycle的play"+ce);
	}
}

