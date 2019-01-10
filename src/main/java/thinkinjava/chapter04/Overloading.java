package thinkinjava.chapter04;

public class Overloading {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			Tree t = new Tree(i);//i=0,
			t.info();
			t.info("overloaded method");
		}
	// Overloaded constructor:
	new Tree();
	}
}
