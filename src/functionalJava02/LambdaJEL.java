package functionalJava02;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaJEL extends JFrame {
	
	//use EL

	private static final long serialVersionUID = 1L;
	
	public LambdaJEL() {
		
		JButton myButton = new JButton("Click me");
		add(myButton);

		myButton.addActionListener(actionEvent -> System.out.println("Click me ok!"));
		
		pack();
	}

	public static void main(String[] args) {
		
		LambdaJ f = new LambdaJ();
		f.setVisible(true);

	}

}