import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Let's build a rectangle");
		
		System.out.println("Enter # of rows");
		int rows = scanner.nextInt();
		
		System.out.println("Enter # of columns");
		int columns = scanner.nextInt();
		
		System.out.println("Enter a symbol");
		String symbol = scanner.next();
		
		System.out.println("Great! Here's your rectangle:");
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			
			for(int j = 1; j<=columns; j++) {
				System.out.print(symbol);
			}
		}
		
	}
}
