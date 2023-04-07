import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String[] animals = {"cat", "dog", "bird", "fish"};
		
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println("--------");
		
		ArrayList<String> sports = new ArrayList<>();
		
		sports.add("soccer");
		sports.add("tennis");
		sports.add("mma");
		
		for(String sport : sports) {
			System.out.println(sports.indexOf(sport));
		}
	}
}
