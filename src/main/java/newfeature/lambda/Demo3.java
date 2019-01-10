package newfeature.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Rocky on 2018-11-21.
 */
public class Demo3 {

	public static void main(String[] args) {
		String[] players = {"Rafael Nadal", "Novak Djokovic",   
			    "Stanislas Wawrinka", "David Ferrer",  
			    "Roger Federer", "Andy Murray",  
			    "Tomas Berdych", "Juan Martin Del Potro",  
			    "Richard Gasquet", "John Isner"};  
		
		//1.1使用匿名内部类 排序 players
		Arrays.sort(players, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(Arrays.toString(players));
		
		//1.2使用lambdas expression 排序player
		Comparator<String> sortByName = (String s1, String s2) -> s1.compareTo(s2);
		Arrays.sort(players, sortByName);
		System.out.println(Arrays.toString(players));
		
		//1.3也可以使用如下形式 
		Arrays.sort(players, (String s1, String s2) -> s1.compareTo(s2)); 
		System.out.println(players);
		
		
	}
}
