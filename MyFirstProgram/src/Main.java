import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Choose a whole number do be divided");
			int n1 = scanner.nextInt();
			
			System.out.println("Now choose a whole number to divide by");
			int n2 = scanner.nextInt();
			
			System.out.println("Result: "+n1+"/"+n2+" = "+n1/n2);	
		}
		catch(ArithmeticException e) {
			System.out.println("Error: Arithmetic Exception");
		}
		catch(InputMismatchException e) {
			System.out.println("Error: Input Mismatch Exception");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		finally {
			scanner.close();
		}
	}
}
