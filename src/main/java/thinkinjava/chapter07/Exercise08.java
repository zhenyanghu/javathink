package thinkinjava.chapter07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise08 {

	public static void main(String[] args) {
		Boo b = new Boo();
		Boo boo = new Boo(1);
		ArrayList<String> arrayList = new ArrayList<String>();
		Map<String,String> hashMap = new HashMap<String,String>();
		Boo boo2 = new Boo();
	}
}

class Aoo {
	public Aoo(int i) {
		System.out.println("Aoo constructor"+i);
	}
}

class Boo extends Aoo {
	public Boo() {
		super(0);
		System.out.println("wucan");
	}
	public Boo(int i) {
		super(i);
		System.out.println("Boo constructor"+i);
	}
}
