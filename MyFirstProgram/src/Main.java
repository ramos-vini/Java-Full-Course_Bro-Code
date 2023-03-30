import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		if (age < 12) {
			System.out.println("You're gonna be the next Bill Gates, my little friend.");
		}
		else if(age < 18) {
			System.out.println("Really good, my friend! You will have a wonderfull carrier!");
		}
		else if (age < 65) {
			System.out.println("Nice! Keep working on your Java skills!");
		}
		else {
			System.out.println("It's never late to learn Java! Keep going :)");
		}
		
		scanner.close();
		
	}

}
