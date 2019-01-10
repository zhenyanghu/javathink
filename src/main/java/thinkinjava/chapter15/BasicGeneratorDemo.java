package thinkinjava.chapter15;

import thinkinjava.util.Generator;

import static thinkinjava.util.BasicGenerator.create;

public class BasicGeneratorDemo {

	public static void main(String[] args) {
		 Generator<CountedObject> co = create(CountedObject.class);
//		Generator<CountedObject> co = new BasicGenerator<CountedObject>(CountedObject.class);
		 System.out.println(co.next());
		 for (int i = 0; i < 5; i++) {
			 System.out.println(co.next());
		}
	}
}
