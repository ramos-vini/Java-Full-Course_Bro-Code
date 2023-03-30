import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// &&, ||, !
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You're playing a game. Press \"q\" or \"Q\" to quit.");
		String res = scanner.nextLine();
		
		if(res.equals("q") || res.equals("Q")) {
			System.out.println("You quit the game.");
		}
		else {
			System.out.println("You're still in the game.");
		}
		
		/*
		 * if(!res.equals("q") && !res.equals("Q")) {
		
			System.out.println("You're still in the game.");
		}
		else {
			System.out.println("You quit the game.");
		}
		*/
		
		scanner.close();
		
	}
}
