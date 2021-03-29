//KMcQuaide
//28 Jan 2021
//Lab02

import java.util.Scanner;

public class KMcQuaideLab02 {

	public static void main(String[] args) {
		Scanner keyBd = new Scanner(System.in);
		String name;
		Double value1;
		Double value2;
		
		//Welcome the user
		System.out.println("Welcome to my Lab!");
		
		//User enters their name
		System.out.print("What is your name? ");
		name = keyBd.nextLine();
		
		//echo
		System.out.println("\nHello, " + name + ".\n");
		
		//list of numbers 11, 12, 13
		System.out.println("First, I will list numbers in two different ways:\n");
		System.out.println("11.\n12.\n13.\n");
		System.out.print("11 - 12 - 13\n");
		
		//User enters two whole numbers
		System.out.println(name + ", please enter 2 whole numbers:");
		value1 = keyBd.nextDouble();
		value2 = keyBd.nextDouble();
		System.out.printf("Your numbers with 3 decimals: %.3f", value1);
		System.out.printf(" and %.3f%n", value2);
		
		//Thanks for using the program
		System.out.println("\nGoodbye " + name + ". Thanks for testing my Lab.");
		
}
}