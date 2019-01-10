package reflect;

import java.io.Serializable;

/**
 * 获取完整的类名
 * @author Rocky
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.getClass().getName());
	}

}

class Demo implements Serializable {
	
}
