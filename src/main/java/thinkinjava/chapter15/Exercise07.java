package thinkinjava.chapter15;

import java.util.Iterator;

/**
 * 通过组合的方式来创建适配器类
 * @author Rocky
 *
 */
public class Exercise07 implements Iterable<Integer> {

	private int n;
	
	private Fibonacci fibonacci;
	
	public Exercise07(Fibonacci fibonacci, int count) {
		this.fibonacci = fibonacci;
		this.n = count;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return n > 0;
			}

			@Override
			public Integer next() {
				n--;
				return Exercise07.this.fibonacci.next();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		Exercise07 exercise = new Exercise07(new Fibonacci(), 18);
		for (Integer i : exercise) {
			System.out.print(i + " ");
		}
	}

}
