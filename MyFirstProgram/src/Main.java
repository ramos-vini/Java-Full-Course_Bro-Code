public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car("Camaro", "Chevrolet", 2020);
		
		myCar.setYear(2022);
		
		System.out.println(myCar.getModel());
		System.out.println(myCar.getMake());
		System.out.println(myCar.getYear());
	}
}
