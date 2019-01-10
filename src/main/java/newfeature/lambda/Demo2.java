package newfeature.lambda;

/**
 * Created by Rocky on 2018-11-21.
 */
public class Demo2 {

	public static void main(String[] args) {
		//1.1使用匿名内部类
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello World");
				
			}
		}).start();
		//1.2使用lamdas expression
		new Thread(() -> System.out.println("Hello World")).start();
		//2.1使用匿名内部类
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello World");
				
			}
		};
		//2.2使用 lambdas expression
		Runnable r2 = () -> System.out.println("Hello World"); 
		
		//直接调用run方法（没有开新线程）
		r1.run();
		r2.run();
		
	}
}
