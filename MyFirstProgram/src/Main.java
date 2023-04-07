import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String name = "Bro";
		
		hello(name, 21);
		
		System.out.println(add(2,3));
	}
	
	static void hello(String p1, int p2) {
		System.out.println("Hello "+p1+", you're "+p2);
	}
	
	static int add(int p1, int p2) {
		
		int sum = p1+p2;
		
		return sum;
	}
}
