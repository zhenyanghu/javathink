package thinkinjava.chapter06.local;

public class Foreign {

	public static void main(String[] args) {
		PackagedClass pc = new PackagedClass(); 
		boolean flag = pc instanceof PackagedClass;
		System.out.println(pc instanceof PackagedClass);
		//Foreign f = new Foreign(); 
		float f = 3.14F;
		System.out.println(f);
		//System.out.println(f instanceof Float);
	}
}
