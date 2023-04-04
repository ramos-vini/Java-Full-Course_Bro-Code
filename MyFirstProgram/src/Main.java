import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Let's create a tree!\nType in a symbol for it.");
		
		String symbol = scanner.nextLine();
		
		System.out.println("Great! Now choose the number of branches of your tree.");
		
		int branches = scanner.nextInt();
		
		int symbolNumber = 1;
		
		// Tree Branches:
		
		for(int i = 0; i < branches; i++) {
			
			int blankNumber = branches-1-i;
			
			for (int j = 0; j < blankNumber; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < symbolNumber; j++) {
				System.out.print(symbol);
			}
			
			for (int j = 0; j < blankNumber; j++) {
				System.out.print(" ");
			}
				
			System.out.println();
			
			symbolNumber += 2;
		}
		
		// Tree's stem:
		
		for(int i = 0; i < (Math.round(branches/2)); i++) {
			// branches - 1 then 1 then branches -1
			
			for (int j = 0; j < branches-1; j++) {
				System.out.print(" ");
			}
			
			System.out.print(symbol);
			
			for (int j = 0; j < branches-1; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		scanner.close();
		
	}
}
