//Kyle McQuaide
//March 4 2021
//Lab07
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Color {
	
	public static void main(String[] args) {
		
		String colorCode = "";
		int colorAmount = 255;
		Scanner scanner = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Welcome!");
		
		//choosing color amount
		String myColorAmount;
		do {
			myColorAmount = JOptionPane.showInputDialog(null, "Please enter a color between 0 and 255");
			try {
				colorAmount = Integer.parseInt(myColorAmount);
				if (colorAmount >=0 && colorAmount <= 255) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Number out of range.");
				}
			}
			catch (Exception ex) {
				if (myColorAmount == null) {
					break;
				} else {
					System.out.println("Incorrect input..." + ex);
				}
			}
		}while(true);
		
		//choosing color code
		do {
			colorCode = JOptionPane.showInputDialog(null, "Please input the color you would like to choose: red, green, or blue");
			try { 
				if (colorCode.equalsIgnoreCase("red") || colorCode.equalsIgnoreCase("green") || colorCode.equalsIgnoreCase("blue")) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Choose an available color...");
				}
			}
			catch (Exception ex) {
				if (colorCode == null) {
					break;
				} else {
					System.out.println("Incorrect input..." + ex);
				}
			}
		}while(true);
		
		if (myColorAmount == null || colorCode == null) {
			JOptionPane.showMessageDialog(null, "Need both Color Amount AND Color Code to finalize an answer.");
		} else {
			JOptionPane.showMessageDialog(null, "Setting the " + colorCode + " color to " + myColorAmount + ".");
		}
		JOptionPane.showMessageDialog(null, "Thank you for using this program.");
	}	
}
