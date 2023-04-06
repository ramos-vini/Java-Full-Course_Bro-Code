import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		
		bakeryList.add("Croissant");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Cheese Bread");
		
		ArrayList<String> produceList = new ArrayList<String>();
		
		produceList.add("Tomatoes");
		produceList.add("Onions");
		produceList.add("Pasta");
		
		ArrayList<String> saucesList = new ArrayList<String>();
		
		saucesList.add("Spicy");
		saucesList.add("Rosé");
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>(); // 2D ArrayList
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(saucesList);
		
		for(int i=0; i<groceryList.size(); i++) {
			System.out.println("List "+(i+1)+":\n");
			for(int j=0; j<groceryList.get(i).size(); j++) {
				System.out.print("- ");
				System.out.println(groceryList.get(i).get(j));
			}
			System.out.println();
		}
		
	}
}
