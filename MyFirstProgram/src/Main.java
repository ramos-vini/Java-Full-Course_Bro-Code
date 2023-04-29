public class Main {

	public static void main(String[] args) {
		
		// Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("Pizza", 7);
		Food food2 = new Food("Sushi", 10);
		Food food3 = new Food("Hamburguer", 9);
		
		Food[] refrigerator = {food1, food2, food3};
		
		for (Food food : refrigerator) {
			System.out.printf("Food: %s\nRating: %d\n\n", food.name, food.rating);
		}
		
		/*
		System.out.printf("Food 1: %s\nRating: %d\n\n", food1.name, food1.rating);
		System.out.printf("Food 2: %s\nRating: %d\n\n", food2.name, food2.rating);
		System.out.printf("Food 3: %s\nRating: %d\n\n", food3.name, food3.rating);
		*/
	}
}
