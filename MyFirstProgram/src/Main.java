public class Main {

	public static void main(String[] args) {
	
		Pizza pizza1 = new Pizza("thicc crunch", "tomato", "brie", "spanish ham");
		System.out.println("Pizza 1 ingredients:");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.topping);
		
		System.out.println("-----------");
		
		Pizza pizza2 = new Pizza("thicc crunch", "tomato");
		System.out.println("Pizza 2 ingredients:");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.sauce);
	}
}
