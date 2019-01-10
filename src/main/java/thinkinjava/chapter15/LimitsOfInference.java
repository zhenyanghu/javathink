package thinkinjava.chapter15;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {

	static void f(Map<String, List<String>> map) {
		
	}
	
	public static void main(String[] args) {
		//f(New.map()); //does not compile
	}
}
