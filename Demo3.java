package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo3 {
	public static void main(String[] args) {
			Predicate<Integer> obj= (a)->  a%2==0;
			System.out.println(obj.test(4));
			
			Function obj1 = new Function<>() {

				@Override
				public Object apply(Object t) {
					if(t instanceof Integer) {
						Integer x= (Integer) t;
						return Math.sqrt(x);
					}
					return null;
				}
			};
			
			Function obj2 = (t)->{//Object -> Integer
				if(t instanceof Integer) {
					Integer x= (Integer) t;
					return Math.sqrt(x);
				}
				return null;
			};
	}
	
	//Function: random number
	
	
}
// obj -> sq of the obj

//Function interfaces: java.util.function{30}
//Predicate: obj -> boolean
//Supplier: ()-> obj
//Consumer: obj -> void
//Function obj1-> obj2

//Bifunction : obj1, obj2 -> obj3
//BiConsumer: obj1, obj2 -> none
//BiPredicate: obj1, obj2-> boolean
