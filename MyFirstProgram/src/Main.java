import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Hey there! What's your name?");
		JOptionPane.showMessageDialog(null, "Hello "+name+"!");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		JOptionPane.showMessageDialog(null, "Your age is: " +age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height (m)?"));
		JOptionPane.showMessageDialog(null, "You are "+height+ "m tall");
		
	}

}
