package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test6 {

	/**
	 * 获取某个类的全部方法
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("reflect.User");
		Method[] methods = clazz.getMethods();
		for(int i = 0; i < methods.length; i++) {
			int mod = methods[i].getModifiers();
			String priv = Modifier.toString(mod);
			Class returnType = methods[i].getReturnType();
			String name = methods[i].getName();
			Class[] pTypes = methods[i].getParameterTypes();
			System.out.print(priv + " " + returnType + " " + name);
			System.out.print("(");
			for(int j = 0; j < pTypes.length; j++) {
				if(j == pTypes.length - 1)
					System.out.print(pTypes[j].getName());
				else
					System.out.print(pTypes[j].getName() + ", ");
			}
			System.out.print(")");
			Class[] exceTypes = methods[i].getExceptionTypes();
			for(int j = 0; j < exceTypes.length; j++) {
				System.out.print(" throws ");
				if(j == exceTypes.length - 1) 
					System.out.print(exceTypes[j].getName());
				else
					System.out.println(exceTypes[j].getName() + ", ");
			}
			System.out.println();
		}
		
	}
}
