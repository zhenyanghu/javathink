package enumdemo;

public enum EnumDemo3 implements Food, Sport {

	FOOD,
	SPORT;

	@Override
	public void run() {
		System.out.println("run......");
	}

	@Override
	public void eat() {
		System.out.println("eat......");
	}
	
	//测试
	public static void main(String[] args) {
		EnumDemo3.FOOD.eat();
		EnumDemo3.SPORT.run();
	}
	
}

interface Food {
	void eat();
}

interface Sport {
	void run();
}
