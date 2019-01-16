package lambda;

public class Demo2 {
	public static void main(String[] args) {
		I2 obj= new I2() {
			public int add(int a, int b) {
				return a+b;
			}
		};
		System.out.println(obj.add(3, 4));

		I2 obj2= (int a, int b)->{
			return a+b;
		};
		
		System.out.println(obj2.add(3, 4));
		I2 obj1= (int a, int b)-> a+b;
		System.out.println(obj1.add(3, 4));
		
		I2 obj3= (a,b)-> a+b;
		System.out.println(obj3.add(3, 4));
	}
}


interface I2{
	int add(int a, int b);
}