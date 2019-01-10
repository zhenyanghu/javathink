package thinkinjava.chapter07;

/**
 * 构建对象得时候是从基类向外扩张得，所以基类在导出类构造器可以访问它之前就已经完成了初始化
 * @author Rocky
 *
 */
public class Cartoon extends Drawing {

	public Cartoon() {
		System.out.println("Cartoon constructor");//3 
	}
	public static void main(String[] args) {
		Cartoon c = new Cartoon();
	}
}

class Art {
	public Art() {
		System.out.println("Art constructor");//1
	}
}

class Drawing extends Art {
	public Drawing() {
		System.out.println("Drawing constructor");//2
	}
}