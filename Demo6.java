package lambda;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo6 {
	public static void main(String[] args) {
		List<Integer> list= List.of(11,13,3,6,2,19);
		//even : *5 
		int s=list.stream().filter(x->
									{ System.out.println(x); 
										return x%2==0;})
								.mapToInt(x-> x*5).sum();//Intermediary operation
		//Terminary operator: sum() , count(), consumer
		System.out.println(s);
		
		
		//list: /5 : allow : print
		
		list.stream().filter(x-> x%5==0).forEach(x-> System.out.println(x));
		
		
		//List: even :  TreeSet (sorted, no duplicates)
		Set<Integer> set=list.stream().filter(x-> x%2==0).sorted().collect(Collectors.toCollection(()-> new TreeSet<Integer>()));
		System.out.println(set);
		
		// list: even: ^2 : sum
		list.stream().filter( n -> n%2==0 ).mapToInt(n -> n*n).sum();
		
		list.stream().filter( n -> n%2==0 ).map(a-> a*a).reduce((z,y)-> z+y); //BiFunction
		
		//If u have operated upon a stream, u cannot reuse it
		
		Stream s1= list.stream().filter( n -> n%2==0 );
		s1.findFirst();
		
		//s1.count(); Error
		
		//Seeta, Geeta, Taruna: stream .. e -> Set 
		
		Stream.of("Seeta", "Geeta","Taruna").filter(x-> x.contains("e")).collect(Collectors.toCollection(()-> new TreeSet<String>()));
		
		
		Stream.of("Seeta", "Geeta","Taruna").
		filter(x-> x.contains("e")).
		peek(x-> System.out.println(x)).
		collect(Collectors.joining(" "));
		
		Stream.of("Seeta", "Geeta","Taruna").filter(x-> x.contains("e")).reduce((x,y)-> x+" "+y);
		//Seeta Geeta
	}
}
