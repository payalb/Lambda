package lambda;

public class Demo1 {
	public static void main(String[] args) {
		I1 obj= new I1() {
			public void m1() {
				System.out.println("m1 called");
			}
		};
		obj.m1();
		//Lambda expression
		I1 obj1= ()->{
			System.out.println("m1 called");
		};
		obj1.m1();
		
		//If a method has only 1 statement, no need to put in a {}
		I1 obj2= ()-> System.out.println("m1 called");
		obj2.m1();
	}
}
//Functional Interface: java 8: Interface which has only 1 abstract method.
//It may have any number of static/ default/ private

//Interface: //before java 8
//@FunctionalInterface //compile time check
interface I1{
	void m1(); //abstract, public
}
//Functional Interface: 1 method: impl