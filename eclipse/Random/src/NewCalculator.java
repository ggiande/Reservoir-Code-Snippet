import java.util.Scanner;
/*
 * Name: Giancarlo Garcia Deleon
 * Last Updated: March 14, Thursday 9:41 PM
 * Project 2: RPN Calculator
 * This program is a reverse polish notation application in Java
 * that simply takes in user input much like in a calculator, but
 * after each return is pressed, operations are executed as listed 
 * on the indicated help message that is available by pressing "h"
 * or "?". Additionally please make sure to type only valid strings,
 * and note that consecutive operations must be separated by returns.
 * Attempting to abuse this system will result in a crash. Thank You.
 */
public class NewCalculator extends rpnCalc {
	public static void main (String [] args) {
		System.out.println("To enter a valid post-fix expression, hit return after every token.");
		System.out.println("Acknowldege the preset commands. For help, please enter 'h' or '?'");
		
		String targetWord;
		Scanner in = new Scanner(System.in);
		
		rpnCalc evaluator = new rpnCalc();
		
		do {
    	   targetWord = in.nextLine();
    	   evaluator.evaluate(targetWord);
   		
       } while (!targetWord.equals("q"));
		in.close();
	}
}
