package lambda;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Demo7 {
	public static void main(String[] args) {
			List<Person> people=	List.of(new Person(1, "Payal", 34),
						new Person(2, "Ritu", 32),
						new Person(3, "Shweta", 34) );
			
		OptionalDouble d=people.stream().filter(x-> x.age>40).mapToInt(x-> x.age).average();
			if(d.isPresent()) {
				System.out.println(d.getAsDouble());
			}
			double result=d.orElse(0.0);
			
			Optional<Person> p=people.stream().findAny();
			Person p1=p.orElse(new Person());
			
			
	}
}
//average age
class Person{
	int id;
	String name;
	int age;
	Person(int id, String name, int age){
		this.id= id;
		this.name= name;
		this.age= age;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
}