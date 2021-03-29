//KMcQuaide
//18 Feb. 2021
//Lab05 Heart Rate Class

public class HeartRates {

	private String firstName;
	private String lastName;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	//Default Constructor
	public HeartRates() {		
		this("Null", "Null", 2002, 1, 1);
		System.out.println("Default Values: ");
	}
	
	//Constructor
	public HeartRates(String firstName, String lastName, int birthYear, int birthMonth, int birthDay) {
		System.out.println();
		setFirstName(firstName);
		setLastName(lastName);
		setBirthYear(birthYear);
		setBirthMonth(birthMonth);
		setBirthDay(birthDay);
	}
	
	//Set Method
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {		
		this.lastName = lastName;
	}
	public void setBirthYear(int birthYear) {
		if (birthYear >= 0 && birthYear < 2021)
			this.birthYear = birthYear;
		else {
			birthYear = 2000;
		}
	}
	public void setBirthMonth(int birthMonth) {
		if (birthMonth > 0 && birthMonth <= 12)
			this.birthMonth = birthMonth;
		else {
			birthMonth = 1;
		}
	}
	public void setBirthDay(int birthDay) {
		if (birthDay > 0 && birthDay <= 31)
			this.birthDay = birthDay;
		else {
			birthDay = 1;
		}
	}
	
	//Get Method
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public int gethBirthMonth() {
		return birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	
	
	//Calculation Methods
	public int calcAge() {
		int age = 0;
		age = (2021 - birthYear);
		return age;
	}
	public int calcMaxRate() {
		int maxRate = 0;
		maxRate = 220 - (2021 - birthYear);
		return maxRate;
	}
	public int calcLowTarget() {
		int lowTarget = 0;
		lowTarget = (int)((double)(calcMaxRate()) * 0.5);
		return lowTarget;
	}
	public int calcHighTarget() {
		int highTarget = 0;
		highTarget = (int)((double)(calcMaxRate()) * 0.85);
		return highTarget;
	}
	
	//Printing Method
	public String toString() {
		return ("Patient Information"
				+ "\nName: " + firstName + " " + lastName
				+ "\nBirthday: "
				+ "\n Month " + birthMonth
				+ "\n Day " + birthDay
				+ "\n Year " + birthYear);
	}
	
	
	
	
	

	
	
}
