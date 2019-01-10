package enumdemo;

public class EnumDemo4 {

	public static void main(String[] args) {
		printName(Color.RED);
	}
	
	private static void printName(Color color) {
		switch (color) {
		case RED:
			System.out.println("红");
			break;
		case GREEN:
			System.out.println("绿");
			break;
		default:
			System.out.println("黄");
			break;
		}
	}
}

enum Color {
	RED, GREEN, YELLOW, BLUE;
}
