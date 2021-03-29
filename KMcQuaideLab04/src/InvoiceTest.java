//KMcQuaide
//Invoice Test Method
//11 Feb 2019

public class InvoiceTest {

	public static void main(String[] arg) {
		
		//Welcome user
		System.out.println("Welcome to the Invoice Tester!\n");
		
		//Invoice01
		Invoice invoice01 = new Invoice();
		System.out.println("\nInvoice01: " + invoice01.toString() );
		
		//Invoice02
		Invoice invoice02 = new Invoice("Drill0118", "Precise at making holes", 2, 5.99);
		System.out.println("\nInvoice02: " + invoice02.toString() );
		
		//Invoice03
		Invoice invoice03 = new Invoice("Flashlight7736", "Lights up dark areas", 5, 2.75);
		System.out.println("\nInvoice03: " + invoice03.toString() );
		
		//Change prive for Invoice02
		invoice02.setPrice(54.99);
		System.out.println("\nInvoice02: " + invoice02.toString() );
		
		//Reprint Invoice02 to confirm price update
		System.out.println("\nInvoice02 individual item price is: $" + invoice02.getPrice());
		
		//Print Invoice02 total invoice amount due
		System.out.println("\nInvoice02 total amount due is: $" + invoice02.getInvoiceAmount());
		
		//Invoice04 has negative quantity to check out if/else statement
		Invoice invoice04 = new Invoice("Rubber Duck", "Quacks", -5, 10.50);
		System.out.println("\nInvoice04: " + invoice04.toString() );
		System.out.println("\nInvoice04 total amount due is: $" + invoice04.getInvoiceAmount());
		
		System.out.println("\nThanks for testing out this software!");
	
	}
}
