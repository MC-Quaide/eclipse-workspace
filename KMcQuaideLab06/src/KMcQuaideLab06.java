//KMcQuaide
//Lab06
//Feb. 25, 2021

import java.util.Scanner;

public class KMcQuaideLab06 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double conversionAmount = 0;
		String conversionCode;
		boolean exit = false;
		
		System.out.println("Welcome to the Conversion Calculator!");
		
		
			//Do While Loop for entering an amount (no negatives or non-integers)
			do{
				try {
					System.out.println("Please enter the amount you would like to convert:");
					conversionAmount = scanner.nextDouble();
					if (conversionAmount > 0){
						scanner.nextLine();
						
					}else {
						System.out.println("Please input a positive amount!\n");
						
					}
				}
				catch (Exception ex) {
					System.out.println("Exeption caught " + ex);
					scanner.nextLine();
				}
			} while (conversionAmount <= 0);
			
			//Do while loop for selecting a conversion code
			do {
				
				System.out.println("Please choose a conversion code to indicate the type of conversion desired."
						+ "\nGL = Gallon to Liter"
						+ "\nIC = Inch to Centimeter"
						+ "\nPK = Pound to Kilogram"
						+ "\nMK = Mile to Kilometer"
						+ "\n\nEnter code:");
				conversionCode = scanner.nextLine();
				if (conversionCode.equals("GL") || conversionCode.equals("gl")) {
					double liters = 0;
					liters = conversionAmount * 3.78541178;
					System.out.printf("%.3f%s%.3f%s%n", conversionAmount, " gallon(s) = ", liters, " liters");
					
					exit = false;
				}else {
					if (conversionCode.equals("IC") || conversionCode.equals("ic")) {
					double centimeters = 0;
					centimeters = conversionAmount * 2.5;
					System.out.printf("%.3f%s%.3f%s%n", conversionAmount, " inch(s) = ", centimeters, " centimeters");
					
					exit = false;
				} else {
					if (conversionCode.equals("PK") || conversionCode.equals("pk")) {
					double kilograms = 0;
					kilograms = conversionAmount * 0.45359237;
					System.out.printf("%.3f%s%.3f%s%n", conversionAmount, " pound(s) = ", kilograms, " kilograms");
					
					exit = false;
				} else {
				if (conversionCode.equals("MK") || conversionCode.equals("mk")) {
					double kilometers = 0;
					kilometers = conversionAmount * 1.609344;
					System.out.printf("%.3f%s%.3f%s%n", conversionAmount, " mile(s) = ", kilometers, " kilometers");
					
					exit = false;
				}
				else {
					System.out.println("Bad Conversiont type...please press enter to try again...\n");
					scanner.nextLine();
					exit = true;
							}
						}
					}
				}
			} while (exit);
			System.out.println("\nThanks for using this program.");

		}
	}