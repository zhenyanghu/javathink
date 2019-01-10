package classloader;

public class JDKClassLoader {

	public static void main(String[] args) {
//		System.out.println(String.class.getClassLoader());
//		System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader());
//		System.out.println(JDKClassLoader.class.getClassLoader().getClass().getName());
		ClassLoader cl = JDKClassLoader.class.getClassLoader();
		while(cl != null) {
			System.out.println(cl.getClass().getName());
			cl = cl.getParent();
		}
	}
}
