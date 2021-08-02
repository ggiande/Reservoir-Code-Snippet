package courses.programmingtwo;

import java.util.Scanner;
/* Name: Giancarlo Garcia Deleon
 * Last Updated: Wednesday, May 8, 2019
 * Project 4:Recursion: Palindromes
 * This program will take in a string and will reverse the order of each character
 * and will print the original string followed by a hyphen and the reversed string.
 * This program will be executed by using recursion. The base case in this instance
 * is the if statement inside the method named reverseString.
 */ 
public class Project6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//User input
		String inputString = input.nextLine();
		String reversed = reverseString(inputString);
		System.out.println(inputString+ "-" + reversed);
		input.close();
	}
	//Method take string parameter and check string is empty or not
	public static String reverseString(String myStr) {
		if (myStr.isEmpty()){	//Base Case
		 return myStr;
		}
		//Calling Function Recursively
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}
 
}