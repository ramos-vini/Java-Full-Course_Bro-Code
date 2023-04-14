import java.util.Random;

public class DiceRoller {
	//Global variables:
	
	//Random random;
	//int number;
	
	DiceRoller(){
		//Local variables:
		Random random = new Random();
		int number = random.nextInt(6)+1;
		
		roll(number);
	}
	
	void roll(int number){
		System.out.println(number);
	}
}
