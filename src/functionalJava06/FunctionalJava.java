package functionalJava06;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FunctionalJava extends JFrame {
	
	public FunctionalJava() {
		JButton myButton = new JButton("click");
		add(myButton);
		
		myButton.addActionListener(ae -> 
				System.out.println("hello"));
		
		pack();
	}
	
	public static void callSAMInterface(MySAMInterface i) {
		i.execute();
	}

	public static void main(String[] args) {
		callSAMInterface(() -> System.out.println("execution"));

	}

}
