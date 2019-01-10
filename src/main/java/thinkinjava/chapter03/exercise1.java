package thinkinjava.chapter03;

public class exercise1 {

	public static void main(String args[]) {
		for(int i=1; i<=100;i++) {
			System.out.print(i + "\t");
			if(i%10==0) {
				System.out.println();
			}
			if(i == 47) {
				return;
			}
		}
		
	}
}
