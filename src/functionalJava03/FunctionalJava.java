package functionalJava03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//EL access to local variable and context class
public class FunctionalJava extends JFrame {
	
	private static final long serialVersionUID = 1L;

	JTextField text;
	
	public FunctionalJava() {
		setLayout(new FlowLayout());
		text = new JTextField("hello my friend");
		add(text);
		JButton clicK = new JButton("click");
		add(clicK);
		clicK.addActionListener(ae -> text.setText("fuck you!"));
		pack();
	}

	public static void main(String[] args) {
		
		FunctionalJava f = new FunctionalJava();
		f.setVisible(true);

	}

}
