public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		Boat boat = new Boat();
		Bicycle bike = new Bicycle();
		
		Vehicle[] racers = {car, boat, bike};
		
		for (Vehicle v : racers) {
			 v.go();
		}
	}
}
