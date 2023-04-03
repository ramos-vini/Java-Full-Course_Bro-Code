import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
		do {	
			System.out.println("Hello! What's your name?");
			name = scanner.nextLine();
		} while(name == "");
		
		System.out.println("Nice to meet you, "+name+"!");
	}
}
