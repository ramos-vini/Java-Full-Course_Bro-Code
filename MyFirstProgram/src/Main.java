import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> foods = new ArrayList<String>();
		
		foods.add("sushi");
		foods.add("hotdog");
		foods.add("hamburger");
		
		foods.remove(0);
		foods.set(1, "pizza");
		foods.add(1, "döner");
		// foods.clear();
		
		
		for(int i=0; i<foods.size(); i++) {
			System.out.println(foods.get(i));
		}
		
	}
}
