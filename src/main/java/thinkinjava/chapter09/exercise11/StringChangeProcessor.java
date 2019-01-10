package thinkinjava.chapter09.exercise11;

public class StringChangeProcessor {

	public static void main(String[] args) {
		Apply.process(new StringAdapter(new ChangeString()),"可以的呵呵呵");
	}
}
