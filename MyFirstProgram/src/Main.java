public class Main {

	public static void main(String[] args) {
		
		String[] cars = {"Camaro", "Corvette", "Tesla"};
		
		System.out.println(cars[0]);
		
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
