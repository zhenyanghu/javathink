package thinkinjava.chapter05;

public class Exercise15 {

	public static void main(String[] args) {
		new Phone();
		new Phone("mi");
	}
}

class Phone {
	String name;
	String price;
	{
		name = "apple";
		price = "6500";
		System.out.println("name"+name+"  price:"+price);
	}
	Phone() {
		System.out.println("phone");
	}
	
	Phone(String maker) {
		System.out.println("phone for "+maker);
	}
	
}