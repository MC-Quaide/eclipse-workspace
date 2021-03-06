//KMcQuaide
//March 25 2021
//Lab09

import java.util.Scanner;



public class SalesItemTester {
	
	//Main
	public static void main(String[] args) {
		
		String key = "0";
		String description = " ";
		double price = 0;
		int quantity = 0;
		
		welcome();
		printTable();
		inputKey();
		inputQuantity();
		switch (key) {
			case "1":
				description = "Hat";
				price = 9.99;
				break;
			case "2":
				description = "Coat";
				price = 69.99;
				break;
			case "3":
				description = "Jacket";
				price = 49.99;
				break;
			case "4":
				description = "Ball";
				price = 2.92;
				break;
			case "5":
				description = "Club";
				price = 21.97;
				break;
			case "6":
				description = "Marker";
				price = .99;
				break;
			case "0":
				description = " ";
				price = 0;
				break;
			}
		
		SalesItem invoice01 = new SalesItem(key, description, price, quantity);
		System.out.println("\nInvoice01: " + invoice01.toString() );
		System.out.println("\nInvoice01 total amount due is: $" + invoice01.getInvoiceAmount());
		
		thanks();	
	}
		
		

	//welcome
	public static void welcome() {
			System.out.println("Welcome!");
	}
	
	//thanks
	public static void thanks() {
		System.out.println("Thanks for using this program!");
	}
	
	//Print original table for customer
	
	//print table
	public static void printTable() {
		System.out.println("Key |" + "Description |" + "Price|" +
				"\n------------------------------" +
				"\n1" + "      Hat" + "        9.99" +
				"\n2" + "      Coat" + "       69.99" +
				"\n3" + "      Jacket" + "     49.99" +
				"\n4" + "      Ball" + "       2.92" +
				"\n5" + "      Club" + "       21.97" +
				"\n6" + "      Marker" + "     .99");
	}
	
	//User input for Key
	
	//Input Key
	public static String inputKey() {
		int keynum = 0;
		System.out.println("Please enter a valid product key or 0 to exit: ");
		do {
			try {
				Scanner scan = new Scanner(System.in);
				keynum = scan.nextInt();
				if (keynum > 0 && keynum <= 6) {
					break;
				} else {
					System.out.println("Please try again...");
				}
			}
			catch (Exception ex) {
				if (keynum == 0) {
					break;
				} else {
					System.out.println("Please try again...");
				}
			}	
		}while (true);
		String key = String.valueOf(keynum);
		return key;
	}
	
	//User input for quantity
	
	//Input Quantity
	public static int inputQuantity() {
		int quantity = 0;
		System.out.println("Please enter a valid quantity or 0 to exit: ");
		do {
			try {
				Scanner scan = new Scanner(System.in);
				quantity = scan.nextInt();
				if (quantity > 0) {
					break;
				} else {
					System.out.println("Please try again...");
				}
			}
			catch (Exception ex) {
				if (quantity == 0) {
					break;
				} else {
					System.out.println("Please try again...");
				}
			}	
		}while (true);
		return quantity;
		
	}
}
