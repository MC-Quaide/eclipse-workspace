//KMcQuaide
//18 Feb. 2021
//Lab05 Heart Rate Utility Class

import java.util.Scanner;

public class HeartRatesDataInput {
	Scanner scanner = new Scanner(System.in);
	String firstName;
	String lastName;
	int birthYear;
	int birthMonth;
	int birthDay;
	
	
	public String getFirstName(String myString) {
		System.out.println(myString);
		firstName = scanner.nextLine();
		return firstName;
	}
	public String getLastName(String myString) {
		System.out.println(myString);
		lastName = scanner.nextLine();
		return lastName;
	}
	public int getBirthYear(String myString) {
		do {
			System.out.println(myString);
			birthYear = scanner.nextInt();
		}
		while (birthYear <= 1900 || birthYear > 2021);
		return birthYear;
	}
	public int getBirthMonth(String myString) {
		do {
			System.out.println(myString);
			birthMonth = scanner.nextInt();
		}
		while (birthMonth <= 0 || birthMonth > 12);
		return birthMonth;
	}
	public int getBirthDay(String myString) {
		do {
			System.out.println(myString);
			birthDay = scanner.nextInt();
		}
		while (birthDay <= 0 || birthDay > 31);
		return birthDay;
		//System.out.println(myString);
		//birthDay = scanner.nextInt();
		//return birthDay;
	}

}
