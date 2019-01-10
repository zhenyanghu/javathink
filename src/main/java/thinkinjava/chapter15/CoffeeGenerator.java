package thinkinjava.chapter15;

import thinkinjava.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{

	@SuppressWarnings("rawtypes")
	private Class[] types = new Class[]{Latte.class, Mocha.class, Cappuccino.class, Americano.class};
	
	private static Random rand = new Random(47);
	
	public CoffeeGenerator() {
		
	}
	
	private static int size = 0;
	
	public CoffeeGenerator(int sz) {
		this.size = sz;
	}
	
	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeItetator();
	}

	@Override
	public Coffee next() {
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	class CoffeeItetator implements Iterator<Coffee> {
		
		int count = size;
		
		@Override
		public boolean hasNext() {
			return count > 0;
		}

		@Override
		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}

	public static void main(String[] args) {
		CoffeeGenerator generator = new CoffeeGenerator();
		for (int i = 0; i < 5; i++) {
			System.out.println(generator.next());
		}
		System.out.println("=============================");
		for (Coffee coffee : new CoffeeGenerator(5)) {
			System.out.println(coffee);
		}
	}
}
