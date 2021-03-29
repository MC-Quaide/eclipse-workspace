//KMcQuaide
//Invoice Method
//11 Feb 2019

public class Invoice {
	
	private String partnumber;
	private String description;
	private int quantity;
	private double price;
	
	//Default Constructor
	public Invoice() {
		System.out.println("Default");
		//partnumber = "Hammer";
		//description = "Hits things";
		//quantity = 0;
		//price = 0.0;
		setPartnumber("ABCD0123");
		setDescription("A wonderous item");
		setQuantity(0);
		setPrice(0);
	}
	
	//Constructor
	public Invoice(String partnumber, String description, int quantity, double price) {
		System.out.println();
		//this.partnumber = partnumber;
		//this.description = description;
		//this.quantity = quantity;
		//this.price = price;
		setPartnumber(partnumber);
		setDescription(description);
		setQuantity(quantity);
		setPrice(price);
	}
	
	//Set variables
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setQuantity(int quantity) {
		if (quantity >= 0)
			this.quantity = quantity;
		else
			quantity = 0;
	}
	public void setPrice(double price) {
		if (price >= 0)
			this.price = price;
		else 
			price = 0;
		
	}
	
	//Get data
	public String getPartnumber() {
		return partnumber;
	}
	public String getDescription() {
		return description;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public double getInvoiceAmount() {
				return (quantity * price);
	}
	
	//Return Type
	public String toString() {
		return ("\n Part Number: " + partnumber
				+ "\n Description: " + description
				+ "\n Quantity: " + quantity
				+ "\n Price: $" + price);
	}
	
}
