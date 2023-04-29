
public class Friend {
	String name;
	static int number;
	
	Friend(String name){
		this.name = name;
		number++;
	}
	
	static void printFriendsNumber(){
		System.out.println("You have "+number+" friend(s).");
	}
}
