package courses.programmingtwo;

import java.util.*;

public class dobject {
	//Print out the object from the user input
	public static void main (String args[]) {
		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter a word to determine if it is a palindrome. ");		//Ask for User input
        String inputString;
        String quit = "no";
        ui evaluator = new ui();
		do {
			inputString = userIn.nextLine().toLowerCase().replaceAll("\\W", "");
			evaluator.check(inputString);
		} while (!inputString.equals(quit));
    	System.exit(0);
		userIn.close();
	}		
}



