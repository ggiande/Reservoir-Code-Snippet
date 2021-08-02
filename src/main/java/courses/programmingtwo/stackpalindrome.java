package courses.programmingtwo;

import java.util.LinkedList;
import java.util.Stack;

public class stackpalindrome {
	public static void main (String [] args) {
		
		String inputString = "pizza";
		Stack<Character> stack = new Stack<Character>(); 
		LinkedList<Character> queue = new LinkedList<Character>();
		

		for (int i = 0; i < inputString.length(); i++) {
	         queue.add(inputString.charAt(i));
	         stack.push(inputString.charAt(i));
	      }    
		

		System.out.println("This is the current queue: " + queue);
		System.out.println("This is the current stack: " + stack);

	}
}