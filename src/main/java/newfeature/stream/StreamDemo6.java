package newfeature.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Rocky on 2018-12-10.
 */
public class StreamDemo6 {

	public static void main(String[] args) throws IOException {
		/*
		 * min/max/distinct: min 和 max 的功能也可以通过对 Stream 元素先排序，再 findFirst 来实现，但前者的性能会更好，为 O(n)，而 sorted 的成本是 O(n log n)。
		 * 	 	同时它们作为特殊的 reduce 方法被独立出来也是因为求最大最小值是很常见的操作。
		 */
		BufferedReader br = new BufferedReader(new FileReader("c:\\SUService.log"));
		int longest = br.lines().mapToInt(String::length).max().getAsInt();
		br.close();
		System.out.println(longest);
		
		/*
		  *  下面的例子则使用 distinct 来找出不重复的单词。 
		 */
		List<String> words = br.lines().flatMap(line -> Stream.of(line.split(" ")))
				.filter(word -> word.length() > 0).map(String::toLowerCase).distinct()
				.sorted().collect(Collectors.toList());
		System.out.println(words);
	}
}
