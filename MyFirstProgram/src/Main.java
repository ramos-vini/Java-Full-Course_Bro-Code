public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("Camaro", "Chevrolet", 2020);
		Car car2 = new Car ("Civic", "Honda", 2022);
		
		// car2 = car1; --> Wrong! (Shared memory address)
		
		car2.copy(car1);
		car2.setYear(2023);
		//or: Car car2 = new Car(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getModel());
		System.out.println(car1.getMake());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getModel());
		System.out.println(car2.getMake());
		System.out.println(car2.getYear());
	}
}
