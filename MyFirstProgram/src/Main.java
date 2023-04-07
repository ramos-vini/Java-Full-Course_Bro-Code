import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		System.out.println(add(1, 2));
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	
	static String add(String a, String b) {
		System.out.println("This is overloaded method #3");
		return a + b;
	}
	
	static double add(int a, int b, double c) {
		System.out.println("This is overloaded method #4");
		return a + b + c;
	}
}
