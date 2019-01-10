package thinkinjava.chapter15;

public class CountedObject {

	private static long count = 0;//静态变量，属于类，初始化为0，从0开始
	//private static final long id = count++;//id属于每个对象，所以不应该是静态的
	private final long id = count++;
	public long id() {
		return id;
	}
	public String toString() {
		return "CountedObject " + id;
	}
	
}
