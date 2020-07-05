import java.util.LinkedList;
import java.util.Scanner;
/* Name: Giancarlo Garcia Deleon
 * Last Updated: Friday, May 3, 2019
 * Project 4:Recursion: Palindromes
 * This program will take in a string and will reverse the order of each character
 * and will print the original string followed by a hyphen and the reversed string.
 * This program will be executed by using recursion. The base case in this instance
 * is the if statement inside the method named reverseString.
 */ 
public class Project5 {
	public static void main (String [] args) {
		System.out.println("Please enter a string to have reversed and conjoined with original string. ");
		Scanner input = new Scanner(System.in);
		String originalString = input.nextLine();
		reverseString(originalString);
		input.close();
		
		
	}

	private static void reverseString(String originalString) {
		LinkedList<Character> queue = new LinkedList<Character>();
		for (int i = 0; i < originalString.length(); i++) {
	         queue.push(originalString.charAt(i));
	      }
		System.out.println(originalString+ "-" + queue.toString().replaceAll("\\W", ""));

		
	}
}
