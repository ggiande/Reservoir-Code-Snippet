import java.util.*;
/* Name: Giancarlo Garcia Deleon
 * Last Updated: Friday, May 3, 2019
 * Project 4:Recursion: Palindromes
 * This program will take in a string and will reverse the order of each character
 * and will print the original string followed by a hyphen and the reversed string.
 * This program will be executed by using recursion. The base case in this instance
 * is the if statement inside the method named reverseString.
 */ 
public class ReverseString {
	public static void main(String args[]) {
		System.out.println("Please enter a string to have reversed and conjoined with original string. ");
		String originalString;
		Scanner input = new Scanner(System.in);
 
		originalString = input.nextLine();
		
		reverseString(originalString);
	      input.close();
		}
	private static void reverseString(String originalString) {
		String reversedString= "";
		int length = originalString.length();			//Set length for for loop
		for (int i = length - 1 ; i >= 0 ; i--) {
		reversedString = reversedString + originalString.charAt(i);		//Adds the characters at the end of the string one by one
		
		}
		System.out.println(originalString + "-"+ reversedString);		//Prints the reversed string in the desired fashion.
	}
		
}