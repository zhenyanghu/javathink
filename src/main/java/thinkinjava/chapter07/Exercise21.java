package thinkinjava.chapter07;

public class Exercise21 {

	public static void main(String[] args) {
		//Bag b = new Bag();
		//b.put();
		SchoolBag sb = new SchoolBag();
		sb.put();
	}
}

class Bag {
	//方法前面加private，有一个隐式的final，他只是这个类中隐藏的程序代码
	private final void put() {
		System.out.println("我可以装东西");
	}
}

class SchoolBag extends Bag {
	/**
	 * 这个方法并没有重写上面的方法，只是名字敲好相同而已
	 */
	void put() {
		System.out.println("我可以装书本");
	}
}

final class DogT {
	int i = 1;
	void f() {
		
	}
}
//被final修改的类不能被继承
//class tomDog extends DogT {
//	
//}