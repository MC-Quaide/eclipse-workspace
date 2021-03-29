//Kyle McQuaide
//
//

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner myKeyboard = new Scanner(System.in);
		String name;
		int myInt;
		double myDouble;
		
		//Welcome
		System.out.print("Please enter your name: ");
		name = myKeyboard.nextLine();
		
		System.out.println("\nHello, " + name + "! Welcome!\n");
		
		//Integer
		System.out.print("Please enter an integer: ");
		myInt = myKeyboard.nextInt();
		System.out.printf("The integer you entered was: %d", myInt);
		
		//Double
		System.out.print("\nPlease enter a number with a decimal: ");
		myDouble= myKeyboard.nextDouble();
		System.out.printf("The number you entered was : %.3f", myDouble);
		
		
		
	}
}
