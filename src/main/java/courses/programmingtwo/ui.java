package courses.programmingtwo;

import java.util.LinkedList;
import java.util.Stack;
/*
 * Name: Giancarlo Garcia Deleon
 * Last Updated: April 11, Friday 10:50 PM
 * Project 3: Palindrome
 * This program will take in a string and use a queue and a stack
 * to determine if the string was a palindrome.
 * Please follow the directions thankyou.
 */
public class ui {


	public void check(String inputString) {
		Stack<Character> stack = new Stack<Character>(); 
		LinkedList<Character> queue = new LinkedList<Character>();

		System.out.println("Your input string was condensed to: " + inputString);
		for (int i = 0; i < inputString.length(); i++) {
	         queue.add(inputString.charAt(i)); stack.push(inputString.charAt(i));
	      }
		boolean verify =true;
		while (!queue.isEmpty()) {
            if (queue.remove().equals(stack.pop())) {
                continue;
            } else {
                verify=false;
                break;
            }
        }
		if (!verify) {
            System.out.println("Your string was not a palindrome. ");
            System.out.println("Would you like to try another one? If yes, type it in, else type no. ");
        } else {
            System.out.println("Your string was a palindrome. ");
            System.out.println("Would you like to try another one? If yes, type it in, else type no. ");
        }
		
	}




}
