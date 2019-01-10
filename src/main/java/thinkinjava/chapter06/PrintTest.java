package thinkinjava.chapter06;
/**
 * 导入静态方法，后面就可以直接用这个方法了
 */
import static thinkinjava.util.Print.print;

public class PrintTest {

	public static void main(String[] args) {
		print("我想调用这个方法");
		//ProtectedTest.say();//这就说明protected可以在同包内中访问，但不是public
	}
}
