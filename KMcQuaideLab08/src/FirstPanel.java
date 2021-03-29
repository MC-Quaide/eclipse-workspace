//KMcQuaide
//March 12 2021
//Lab08

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class FirstPanel extends JPanel{
	
		private int red;
		private int green;
		private int blue;
		
		public FirstPanel() {
			//Default constructor
		}
		
		//FirstPanel constructor
		public FirstPanel(int redColorAmount, int greenColorAmount, int blueColorAmount) {
			this.red = redColorAmount;
			this.green = greenColorAmount;
			this.blue = blueColorAmount;
			this.setBackground(new Color (this.red, this.green, this.blue));
		}
		
		
		
		//Contrast
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
			
			//Contrasting color code
			int redContrast = 0;
			if (red > -1 && red <= 123) {
				redContrast = 255;
			}
			
			int greenContrast = 0;
			if (green > -1 && green <= 123) {
				greenContrast = 255;
			}
			
			int blueContrast = 0;
			if (blue > -1 && blue <= 123) {
				blueContrast = 255;
			}
			this.setForeground(new Color (redContrast, greenContrast, blueContrast));
			g.drawString("Adventures in Programming", getWidth() / 2 - 60, 35);
		}
}
