package thinkinjava.chapter05;

public class Exercise14 {

	public static void main(String[] args) {
		 Vilidate.write();
	}

	
}

class Vilidate {
	static String str1 = "我会好好的";
	static String str2;
	static {
		str2 = "到现在还是深深地深深地爱着你";
	}
	static void write() {
		System.out.println(str1);
		System.out.println(str2);
	}
}