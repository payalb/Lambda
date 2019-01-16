package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(2,3,4,6);
	int temp=0;
	for(int i: list) {
		if(temp<i) {
			temp=i;
		}
	}
	System.out.println(temp);
	//pipe: water pipe
	 list.stream().filter(x-> x%2==0).map(x-> x*2).collect(Collectors.toList());
}
}

//collection: largest in a list

//Predicate : Filter