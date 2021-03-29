//KMcQuaide
//March 25 2021
//Lab09

public class SalesItem {

	private String key;
	private String description;
	private double price;
	private int quantity;
	
	//default constructor
	public SalesItem() {
		setKey("0");
		setDescription(" ");
		setQuantity(0);
		setPrice(0);
	}
	
	public SalesItem(String key, String description, double price, int quantity) {
		this.key = key;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Set variables
	public void setKey(String key) {
		this.key = key;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(double price) {
		if (price >= 0)
			this.price = price;
		else 
			price = 0;
	}
	public void setQuantity(int quantity) {
		if (quantity >= 0)
			this.quantity = quantity;
		else
			quantity = 0;
	}
	
	//Get data
	public String getKey() {
		return key;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getInvoiceAmount() {
				return (quantity * price);
	}
	

	//Return Type toString
	public String toString() {
		return ("\n Sales Item Number: " + key
				+ "\n Description: " + description
				+ "\n Quantity: " + quantity
				+ "\n Price: $" + price);
	}

	
}
