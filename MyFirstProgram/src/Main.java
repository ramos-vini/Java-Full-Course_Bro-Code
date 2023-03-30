import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello! What's your name?");
		String name = scanner.nextLine();
		
		System.out.println("Cool name! How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("And what's your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Your name is: " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("And your favorite food is " + food);
		
	}

}
