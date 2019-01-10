package thinkinjava.chapter09.exercise11;

/**
 * 这个类是发现的，并发创建的
 * @author Rocky
 *
 */
public class ChangeString {

	public String name() {
		return this.getClass().getSimpleName();
	}
	public String chang(String str) {
		char[] chars = str.toCharArray();
		//char t = 0;
		for(int i=0; i<chars.length/2; i++) {
			char t = chars[i];
			chars[i] = chars[chars.length-1-i];
			chars[chars.length-1-i] = t;
		}
		StringBuilder sb = new StringBuilder();
		StringBuilder strsb = sb.append(chars);
		return strsb.toString();
	}
	public static void main(String[] args) {
		ChangeString cs = new ChangeString();
		System.out.println(cs.chang("hello"));
	}
	
}
