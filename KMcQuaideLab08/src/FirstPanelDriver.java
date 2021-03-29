//KMcQuaide
//March 12 2021
//Lab08

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FirstPanelDriver {
	
	public static void main(String[] args) {
		
		JFrame application = new JFrame();
		application.setLocation(250, 250);
		application.setSize(200, 250);
		application.setTitle("Kyle McQuaide");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FirstPanel panel = new FirstPanel();
		application.add(panel);
		
		application.setVisible(true);
		
		
	}
	

}
