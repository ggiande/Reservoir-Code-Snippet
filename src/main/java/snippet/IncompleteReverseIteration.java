package snippet;

public class IncompleteReverseIteration {
	/* Reverses the integer, must keep the temp = num; to allow for the next
	 * for loop to check for palindromes.
	 */
	// TODO: Ensure that it validates for a palindrome

	public static void main(String[] args) {
		int i;
		for(i = 100; i <= 999; i++) {	//899 times once, at every j
			int num = i * 100;  		//Multiples two factors to be checked for palindromes. Runs 899 times.
			int rev_num = 0;

			System.out.println("The number going to be reversed is: "+ num);
	        while(num > 0) {

	            rev_num = rev_num * 10 + num % 10;
	            num = num / 10;
	        }
	        System.out.println("The reversed number is: " + rev_num);
			i++;
			//All the numbers get turned to 0.
			//The numbers are NOT reversed correctly.

			/* Checks to see if the reversed integer is a palindrome, if so
	         * it will push the number into the stack.
	         */
 		}
	}
}
