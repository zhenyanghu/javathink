package thinkinjava.chapter15;

import java.util.Iterator;

/**
 * 通过继承来创建适配器类
 * @author Rocky
 *
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

	private int n;
	
	public IterableFibonacci(int count) {
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
				return IterableFibonacci.this.next();//外部类.this  生成外部类对象的引用
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}
	
	public static void main(String[] args) {
		for (int i : new IterableFibonacci(18)) {
			System.out.print(i + " ");
		}
	}

}
