package thinkinjava.chapter09;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
//		CharSeq cs = new CharSeq();
//		cs.next();
		Scanner scan = new Scanner(new AdaptedCharSeq(5));
		while(scan.hasNext()) {
			System.out.print(scan.next()+" ");
		}
		scan.close();
	}
}

class CharSeq {
	private static Random rand = new Random();
	public static final char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	public char next() {
		int i = rand.nextInt(26);
		return chars[i];
	}
}

/**
 * 这里的适配器用的是继承，之前用的是组合
 * @author Rocky
 *
 */
class AdaptedCharSeq extends CharSeq implements Readable {

	private int count;
	public AdaptedCharSeq(int count) {
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0)
			return -1;
		cb.append(this.next());
		cb.append(" ");
		return 1;
	}
	
}
