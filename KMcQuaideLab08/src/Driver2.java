import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Driver2 {

		
	public static void main(String[] args) {
			
		JFrame application = new JFrame();
		application.setLocation(250, 250);
		application.setSize(200, 250);
		application.setTitle("Kyle McQuaide");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		welcome();
		
		int red = colorChooser("red");
		int green = colorChooser("green");
		int blue = colorChooser("blue");
		
		FirstPanel panel = new FirstPanel(red, green, blue);
		
		application.add(panel);
			
		application.setVisible(true);	
	}
	
	
	public static void welcome() {
		JOptionPane.showMessageDialog(null, "Welcome!");
	}
	
	/**
     * 
     * 
     */
	public static int colorChooser(String colorName) {
			
		String colorString = " ";
		int colorValue = 255;
		
		// color input
		do {
			colorString = JOptionPane.showInputDialog(null, "Please enter a color for " + colorName + " between 0 and 255");
			try {
				colorValue = Integer.parseInt(colorString);
				if (colorValue > -1 && colorValue <= 255) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Number out of range.");
				}
			}
			catch (Exception ex) {
				if (colorString == null) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Input valid value.");
				}
			}
		}while(true);
		
		return colorValue;
	}
}
	
	
	
	


