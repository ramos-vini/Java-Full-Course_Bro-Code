public class Main {

	public static void main(String[] args) {
	
		Car myCar1 = new Car();
		
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		
		System.out.println();
		
		myCar1.drive();
		myCar1.brake();
		
		System.out.println("----------------------");
		
		Car myCar2 = new Car();
		
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		
		System.out.println();
		
		myCar2.drive();
		myCar2.brake();
		
	}
}
