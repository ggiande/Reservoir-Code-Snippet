//import java.util.Stack;

public class iteratethrough {
	public static void main(String[] args) {
		//Stack<Integer> stack = new Stack<Integer>();
			//Integer num = 151;
			
			
			//Integer j = 100;
		Integer i;
		for(i = 100; i <= 999; i++) {	//899 times once, at every j
			//Integer j =100;
			
			Integer num = i * 100;  			//Multiples two factors to be checked for palindromes. Runs 899 times.

			Integer rev_num = 0;
			//Integer temp = num;
			// The number is correctly initiated.
			
			
			/* Reverses the integer, must keep the temp = num; to allow for the next
			 * for loop to check for palindromes.
			 */
			System.out.println("The number going to be reversed is: "+ num);
	        while(num > 0) { 
	            rev_num = rev_num * 10 + num % 10; 
	            num = num / 10;
	        }
	        
	        System.out.println("The reversed number is: " + rev_num);
	        //All the numbers get turned to 0.
            //The numbers are NOT reversed correctly.
           
	        /* Checks to see if the reversed integer is a palindrome, if so
	         * it will push the number into the stack.
	         */
	        
	        /*
	    	if(temp == rev_num) {
	        	stack.push(temp);
	        	System.out.println(temp);
	        }
	        */
	        i++;
 		}
    	//System.out.println(stack); 				//Checks the reversed number in the stack
	}
	

}
