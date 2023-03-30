import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Let's figure out the hipotenuse of your triangle");
		System.out.println("Enter side x: ");
		double x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		double y = scanner.nextDouble();
		
		double z = Math.sqrt((x*x)+(y*y));
		System.out.println("The hipotenuse of your triangle is: "+z);
		
	}

}
