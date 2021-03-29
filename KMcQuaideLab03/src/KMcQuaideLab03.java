//KMcQuaide
//Lab03
//Feb. 06, 2021

import java.util.Scanner;

public class KMcQuaideLab03 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Welcome to the Number Manipulator.\n");
		int largestnum = 0;
		int smallestnum = 0;
		
		//Ask for user to input 4 integers
		System.out.println("\nPlease enter 4 integers seperated by a space or on separate lines: ");
		int num01 = input.nextInt();
		int num02 = input.nextInt();
		int num03 = input.nextInt();
		int num04 = input.nextInt();
		
		//Determining the largest number using && statements
		if ((num01 > num02) && (num01 > num03) && (num01 > num04)) {
			largestnum = num01;
		}	
		if ((num02 > num01) && (num02 > num03) && (num02 > num04)) {
			largestnum = num02;
		}		
		if ((num03 > num01) && (num03 > num02) && (num03 > num04)) {
			largestnum = num03;
		} 			
		if ((num04 > num01) && (num04 > num02) && (num04 > num03)) {
			largestnum = num04;
		}
		
		System.out.println("\nThe largest number is " + largestnum + ".");
		
		//Determining the smallest number using if statements
		smallestnum = num01;
		
		if (num02 < num01) {
			smallestnum = num02;
		}
		if (num03 < num02)
			if (num03 < num01) {
			smallestnum = num03;
		}
		if (num04 < num03)
			if (num04 < num02)
				if (num04 < num01) {
			smallestnum = num04;
		}
		
		System.out.println("The smallest number is " + smallestnum + ".");
		
		//Determining if the smallest number is a factor of the largest number
		if (largestnum % smallestnum > 0) {
			System.out.printf("%n%d%s%d%s%n", smallestnum, " is not a factor of ", largestnum, ".");
			double remainder = (double) largestnum / smallestnum;			
			System.out.printf("%n%d%s%d%s%.4f%s%n%n", largestnum, " divided by ", smallestnum, " is ", remainder, ".");
		} else
			System.out.printf("%n%d%s%d%s%n%n", smallestnum, " is a factor of ", largestnum, ".");
		System.out.print("Thank you for using the Number Manipulator.");
	}
}
