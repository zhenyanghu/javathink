package thinkinjava.chapter05;

public class Exercise21 {

	Money money;
	Exercise21(Money money) {
		this.money = money;
	}
	public static void describe(Money money) {
		switch (money) {
		case YUAN:
			System.out.println("这是一块钱");
			break;
		case JIAO:
			System.out.println("这是一角钱");
			break;
		case FEN:
			System.out.println("这是一分钱");
			break;
		default:
			System.out.println("这不是钱，呵呵");
			break;
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(Money.values().getClass().toString());
		for(Money m : Money.values()) {
			System.out.println(m+": ordinal:"+m.ordinal());
			describe(m);
		}
	}
}
