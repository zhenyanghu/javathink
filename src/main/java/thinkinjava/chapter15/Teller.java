package thinkinjava.chapter15;

import thinkinjava.util.Generator;

public class Teller {

	private static long counter = 1;
	private final long id = counter++;
	private Teller() {}
	
	public String toString() {
		return "Teller -- " + id;
	}
	
//	public static Generator<Teller> generator() {
//		return new Generator<Teller>() {
//
//			@Override
//			public Teller next() {
//				return new Teller();
//			}
//		};
//	}
	
	public static Generator<Teller> generator = new Generator<Teller>() {

		@Override
		public Teller next() {
			return new Teller();
		}
	};
}
