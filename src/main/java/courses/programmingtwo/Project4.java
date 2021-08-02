package courses.programmingtwo;

import java.util.Scanner;
/* Name: Giancarlo Garcia Deleon
 * Last Updated: Friday, May 3, 2019
 * Project 4:Recursion: Palindromes
 * This program will take in a string and will reverse the order of each character
 * and will print the original string followed by a hyphen and the reversed string.
 * This program will be executed by using recursion. The base case in this instance
 * is the if statement inside the method named reverseString.
 */ 
public class Project4 {
	public static void main(String [] args) {
		System.out.println("Please enter a string to have reversed and conjoined with original string. ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
        String reversed = reverseString(str);
        System.out.println(str+ "-" + reversed);
		input.close();
	}
    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}
