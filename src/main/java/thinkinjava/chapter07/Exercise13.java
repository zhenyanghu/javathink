package thinkinjava.chapter07;

public class Exercise13 {

	public static void main(String[] args) {
		BB bb = new BB();
		bb.doA(5);
		bb.doA('e');
		bb.doA("Rocky");
		bb.doA(new CC());
	}
}

class AA {
	void doA(int i) {
		System.out.println("doA(int)");
	}
	void doA(String name) {
		System.out.println("doA(String)");
	}
	void doA(char c) {
		System.out.println("doA(char)");
	}
}

class CC {}

class BB extends AA {
	void doA(CC cc) {
		System.out.println("doA(CC)");
	}
}
