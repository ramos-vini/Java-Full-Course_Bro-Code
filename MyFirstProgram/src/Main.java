import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Animal animal;
		
		System.out.println("Choose your animal:");
		System.out.println("Type \"1\" for Dog");
		System.out.println("Type \"2\" for Cat");
		
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new Dog();
			animal.talk();
		}
		else if(choice == 2) {
			animal = new Cat();
			animal.talk();
		}
		else {
			System.out.println("Invalid number.");
			animal = new Animal();
			animal.talk();
		}
		
		scanner.close();
		
	}
}
