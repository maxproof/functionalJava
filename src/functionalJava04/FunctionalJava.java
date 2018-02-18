package functionalJava04;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FunctionalJava extends JFrame {
		
	private static final long serialVersionUID = 1L;

	public FunctionalJava() {
		JLabel text = new JLabel("click on X to kill process");
		add(text);
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
			}
			
			@Override
			public void windowIconified(WindowEvent e) {	
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {	
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); //kill process
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
		pack();
	}
		
	public static void main(String[] args) {

		//FunctionalJava f = new FunctionalJava();
		//f.setVisible(true);
		
		//default method in interface
		PhysicalPerson pp = new PhysicalPerson("Max");
		System.out.println(pp);
		
		MoralPerson mp = new MoralPerson("IBM ", "HGD4526745");
		System.out.println(mp);
	}

}
