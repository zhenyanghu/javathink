package newfeature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 流的构造与转换
 * Created by Rocky on 2018-12-06.
 */
public class StreamDemo01 {

	public static void main(String[] args) {
		/*
		 * 构造流的最常见方法
		 */
		//1.Individual values
		Stream<String> stream1 = Stream.of("a", "b", "c");
		//2.Array
		String[] strArray = new String[] {"a", "b", "c"};
		Stream<String> stream2 =  Arrays.stream(strArray);
		//3.Collection
		List<String> list = Arrays.asList(strArray);
		Stream<String> stream3 = list.stream();
		
		/*
		 * 对于基本数值型，目前有三种对应的包装类型 Stream：
		 * IntStream、LongStream、DoubleStream。当然我们也可以用 Stream<Integer>、Stream<Long> >、Stream<Double>，
		 * 但是 boxing 和 unboxing 会很耗时，所以特别为这三种基本数值型提供了对应的 Stream。
		 */
		IntStream.of(new int[] {1, 2, 3}).forEach(System.out::println);
		IntStream.range(1, 3).forEach(System.out::println); //[1, 3) 右开区间
		IntStream.rangeClosed(1, 3).forEach(System.out::println);//[1, 3] 闭区间 
		
		/*
		 *  流转换为其它数据结构
		 */
		//1.Array
		String[] strArr1 = stream1.toArray(String[]::new);
		//2.Collection
		List<String> list1 =  stream2.collect(Collectors.toList());
		//3.String
		String str = stream3.collect(Collectors.joining()).toString();
		System.out.println(str);
		
		
	}
}
