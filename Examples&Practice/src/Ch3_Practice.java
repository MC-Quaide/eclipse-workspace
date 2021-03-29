//KMcQuaide
//Door class, describes a door
//11 Feb 2019

public class Ch3_Practice {
	
	//Parts of a well formed class
	//1. Instance variables: describe the object and are not calculated values
	
	//2. Constructors: build object and give values to instance variables
	//	a. Default constructor
	//	b. Full-arg constructor (one arg for each instance variable)
	
	//3. Accessors (get) methods:
	//		returns the value of the instance variable as raw data
	
	//4. Mutator (set) methods
	//		mutate (change) the value of an instance variable
	//		ALL DATA EDITS go in the mutator methods
	
	//5. toString method: will return all instance variable
	//					  in a String with labels...must be
	//					  readable ...does not return calculated values
	
	//Optional methods to: calculate values, send messages, process data...
	
	//1. Instance Variables
	//	all instance variables should be private ( not protected or public)
	private double width;
	private double height;
	private String color;
	
	//2. Constructors: default
	//				   NO ARGUMENTS ()
	//		public is a 'visibility modifier' (access)
	//		private --> protected --> public
	
	public Ch3_Practice() {
		System.out.println(" in Default Constructor"); //debug line
		width = 30.5;	//initialized to most common (hence default) values
		height = 84;
		color = "Autumn Oak";
	}	//end default constructor
	
	//	Constructor: full-arg constructor
	//				 one argument for each instance variable
	public Ch3_Practice( double width, double height, String color) {
		System.out.println(" in Full-Arg Constructor");  //debug line
		this.width = width;
		this.height = height;
		this.color = color;
	}	//end full-arg constructor
	
	//3. Accessor Method (get methods)
	//		will return the instance variable as raw data
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}
	
	//4. Mutator Methods (set)
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//5. Return Type name	arg list
	public String toString() {
		return ("\n Width: " + width
				+ "\n Height: " + height
				+ "\n Color: " + color);
	}

}
