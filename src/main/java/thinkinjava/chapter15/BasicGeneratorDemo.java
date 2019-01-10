package thinkinjava.chapter15;

import net.mindview.util.Generator;

import static net.mindview.util.BasicGenerator.*;
import static net.mindview.util.BasicGenerator.create;

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
