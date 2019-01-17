package lambda;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo8 {
	public static void main(String[] args) {
		//Method reference
		
		Stream.of("Payal","Puja","Ritu","Kanika")
								.forEach(x-> System.out.println(x));
		
		Stream.of("Payal","Puja","Ritu","Kanika")
		.forEach( System.out::println);
		
		
		Stream.of("Payal","Puja","Ritu","Kanika")
						.mapToInt(x-> x.length()) //Instance method
						.sum();
		
		Stream.of("Payal","Puja","Ritu","Kanika")
		.mapToInt(String::length) //Instance method
		.sum();
		
		Stream.of(2,4,6,1,5).mapToDouble(x-> Math.sqrt(x)).sum();//static method
		
		
		Stream.of(2,4,6,1,5).mapToDouble(Math::sqrt).sum();
		
		//constructor
		Object[] arr=Stream.of("Payal","Puja","Ritu","Kanika").map(x-> x.length()).toArray();
		
		Stream.of("Payal","Puja","Ritu","Kanika").map(x-> x.length()).toArray(Integer[]:: new);
				
		/*Integer
		Stream.of("Payal","Puja","Ritu","Kanika").map(x-> x.length()).toArray(x-> {
			
		});*/
		//flatmap: obj-> Stream of objects
		
		int max=IntStream.of(2,4,6,1).flatMap(x-> IntStream.iterate(x, y-> y+1).limit(10)).max().orElse(0);
				System.out.println(max);
		
			int[][] array= {{2,3},{1,2}};	
		int max1=Arrays.stream(array).flatMapToInt(x-> Arrays.stream(x)).max().orElse(0);
		System.out.println(max1);
	}
}
