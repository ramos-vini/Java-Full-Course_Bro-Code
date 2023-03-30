public class Main {

	public static void main(String[] args) {
		String RockPaperScissor = "Scissor";
		
		switch (RockPaperScissor) {
		case "Rock":
			System.out.println("You chose Rock");
			break;
		
		case "Paper":
			System.out.println("You chose Paper");
			break;
			
		case "Scissor":
			System.out.println("You chose Scissor");
			break;	

		default:
			System.out.println("You must choose between either Rock, Paper or Scissor.");
			break;
		}
		
	}

}
