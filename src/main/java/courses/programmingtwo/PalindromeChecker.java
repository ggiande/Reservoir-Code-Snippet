package courses.programmingtwo;

import java.util.*;
/*
 * Name: Giancarlo Garcia Deleon
 * Last Updated: April 11, Friday 10:50 PM
 * Project 3: Palindrome
 * This program will take in a string and use a queue and a stack
 * to determine if the string was a palindrome.
 * Please follow the directions thankyou.
 */
public class PalindromeChecker {
		
	private static final String inputString = null;
	public static void report() {
		if (evaluator(inputString)) {		//if input string is true/false then report.
			System.out.println("That is a palindrome.");
		}
		else {
			System.out.println("That is not a palindrome.");
		}
}		
	public static boolean evaluator(String inputString) {
		Stack<Character> stack = new Stack<Character>(); 
		LinkedList<Character> queue = new LinkedList<Character>();

		for (int i = 0; i < inputString.length(); i++) {
	         queue.add(inputString.charAt(i)); 
	         stack.push(inputString.charAt(i));
	      }
		System.out.println(inputString);
		
		while (!queue.isEmpty()) {
			if (queue.remove() != stack.pop())
			return false;
			}
			return true;
		}

}

