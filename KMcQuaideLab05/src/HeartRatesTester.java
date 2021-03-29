//KMcQuaide
//18 Feb. 2021
//Lab05 Heart Rate Class

public class HeartRatesTester {

	public static void main(String[] arg) {
		
		//Welcome User
		System.out.println("Welcome to the Target Heart Rate Calculator");
		
		HeartRatesDataInput heartRatesData = new HeartRatesDataInput();
		
		String firstName = heartRatesData.getFirstName("Please enter your first name: ");
		String lastName = heartRatesData.getLastName("Please enter your last name: ");
		int birthYear =  heartRatesData.getBirthYear("Please enter the year you were born (ex: 2005): ");
		int birthMonth =  heartRatesData.getBirthMonth("Please enter the month you were born (ex: 1 for January): ");
		int birthDay =  heartRatesData.getBirthDay("Please enter the day you were born: ");
		
		HeartRates person01 = new HeartRates();
		System.out.println("" + person01.toString());
		System.out.println("\nAge: " + person01.calcAge());
		System.out.println("Max Heart Rate: " + person01.calcMaxRate());
		System.out.println("Your target heart rate is between " + person01.calcLowTarget() + " and " + person01.calcHighTarget() + " beats per minute.");
		System.out.println("\nHit your target and shine on!");
		
		
		HeartRates person02 = new HeartRates(firstName, lastName, birthYear, birthMonth, birthDay);
		System.out.println("" + person02.toString());
		System.out.println("\nAge: " + person02.calcAge());
		System.out.println("Max Heart Rate: " + person02.calcMaxRate());
		System.out.println("Your target heart rate is between " + person02.calcLowTarget() + " and " + person02.calcHighTarget() + " beats per minute.");
		System.out.println("\nHit your target and shine on!");
	
		
		
	}
}
