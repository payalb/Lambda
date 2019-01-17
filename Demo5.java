package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo5 {
	public static void main(String[] args) {
		List<Integer> list= List.of(2,4,6,1,4,6);
		Stream<Integer> s1=list.stream();
		
		Set<Integer> set= Set.of(2,4,6,1,4,5);
		Stream<Integer> s2= set.stream();
		
		Map<Integer, Integer> map= Map.of(1,2,3,5,6,7);
		Stream<Entry<Integer,Integer>> s3=map.entrySet().stream();
		
		int[] arr= {2,3,4,6,1};
		IntStream s4=Arrays.stream(arr);
		
		Stream<Integer> s5=Stream.of(3,4,7,1);
		
		Stream<Integer> s6=Stream.concat(s1, s2);
		
		Stream<Object> s7=Stream.builder().add(23).add(54).build();//Builder
		
		Stream<Integer> s8= Stream.empty();
		
		Stream<Double> s9=Stream.generate(()-> Math.random()).limit(10);
		
		Stream<Integer> s10=Stream.iterate(2, x-> x+1).limit(10);
		
		Stream<Integer> s11=Stream.ofNullable(3);
		
	}
}

//Stream api: process collection of objects
//How to create stream