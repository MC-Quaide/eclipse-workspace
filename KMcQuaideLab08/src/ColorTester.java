import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ColorTester {

	
public static void main(String[] args) {
		
		String redColorString = "";
		String greenColorString = "";
		String blueColorString = "";
		int redColorAmount = 255;
		int greenColorAmount = 255;
		int blueColorAmount = 255;
		
		JOptionPane.showMessageDialog(null, "Welcome!");
		
		
		//red color input
		do {
			redColorString = JOptionPane.showInputDialog(null, "Please enter a color for RED between 0 and 255");
			try {
				redColorAmount = Integer.parseInt(redColorString);
				if (redColorAmount > -1 && redColorAmount <= 255) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Number out of range.");
				}
			}
			catch (Exception ex) {
				if (redColorString == null) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Input valid value.");
				}
			}
		}while(true);
		
		//green color input
		do {
			greenColorString = JOptionPane.showInputDialog(null, "Please enter a color for GREEN between 0 and 255");
			try {
				greenColorAmount = Integer.parseInt(greenColorString);
				if (greenColorAmount > -1 && greenColorAmount <= 255) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Number out of range.");
				}
			}
			catch (Exception ex) {
				if (greenColorString == null) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Input valid value.");
				}
			}
		}while(true);
		
		//blue color input
		do {
			blueColorString = JOptionPane.showInputDialog(null, "Please enter a color for BLUE between 0 and 255");
			try {
				blueColorAmount = Integer.parseInt(blueColorString);
				if (blueColorAmount > -1 && blueColorAmount <= 255) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Number out of range.");
				}
			}
			catch (Exception ex) {
				if (blueColorString == null) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Input valid value.");
				}
			}
		}while(true);
		
		JFrame application = new JFrame();
		application.setLocation(250, 250);
		application.setSize(200, 250);
		application.setTitle("Kyle McQuaide");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FirstPanel Panel01 = new FirstPanel(redColorAmount, greenColorAmount, blueColorAmount);
		application.add(Panel01);
		
		application.setVisible(true);
		
		
	}
}