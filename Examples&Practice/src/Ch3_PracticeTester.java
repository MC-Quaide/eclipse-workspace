
public class Ch3_PracticeTester {

	public static void main(String[] arg) {
		
		/*This line does 3 thing
		 * 1. declares an object of Type Door clled door01
		 * 		sets aside and address
		 * 			Door door01
		 * 2. Calls the appropriate constructor based on the 
		 * 		number and type of args sent, args are inside ()
		 * 			new Door();
		 * 3. Assigns the new door object to the address from step 1
		 * 		=
		*/
		
		Ch3_Practice door01 = new Ch3_Practice();
		System.out.println("door01: " + door01.toString() );
		
		Ch3_Practice door02 = new Ch3_Practice(24, 36, "red");
		System.out.println("door02: " + door02.toString() );
		
		//Modifier/Mutate
		door01.setColor("SkyBlue");
		System.out.println("door01: " + door01.toString() );
		
		//Call/Get data
		System.out.println("Door02 color is: " + door02.getColor());
	}
	
}