package functionalJava02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*class MyListenerClass implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Click me ok!");
	}
	
}*/

public class LambdaJ extends JFrame {
	
	//use anonymous class

	private static final long serialVersionUID = 1L;
	
	public LambdaJ() {
		
		JButton myButton = new JButton("Click me");
		add(myButton);
		//MyListenerClass myListener = new MyListenerClass();
		//myButton.addActionListener(myListener);
		myButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("Click me ok!");
			}
		});
		pack();
	}

	public static void main(String[] args) {
		
		LambdaJ f = new LambdaJ();
		f.setVisible(true);

	}

}
