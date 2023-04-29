public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Bicycle myBike = new Bicycle();
		
		System.out.println("My car has "+myCar.wheels+ " wheels.");
		myCar.go();
		
		System.out.println();
		
		System.out.println("My bike has "+myBike.pedals+" pedals.");
		myBike.stop();
	}
}
