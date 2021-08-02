package snippet;
import java.lang.Math;
import java.util.Scanner;
import java.util.Stack;

public class RevisitPrintPrimeFactorization {
	// A function to print all prime factors 
	// of a given number n 
	public static void primeFactors(Long n) {
		if (n == 1){
			System.out.println("1 has no prime factors");
			return;
		}
		Stack<Long> stack = new Stack<>(); //2

		// Print the number of 2s that divide n 
		while (n % 2 == 0) { 
			//System.out.print(2 + " "); 
			stack.push((long) 2);
			n /= 2;
		} 

		// n must be odd at this point. So we can 
		// skip one element (Note i = i + 2)
		for (int i = 3; i <= Math.sqrt(n); i += 2) { // 7
			// While i divides n, print i and divide n 
			while (n % i == 0) {
				//System.out.print(i + " "); 
				stack.push((long) i);
				n /= i; 
			}
		}

		// This condition is to handle the case when 
		// n is a prime number greater than 2 
		if (n > 2) 
			//System.out.print(n); 
		stack.push(n);
		System.out.println(stack);

		Long a, b;
		//Begin searching for the greatest prime factor.
		while(stack.size() > 1) {
			a = stack.pop();
			b = stack.pop();
			if(a > b) {
				stack.push(a);
			} else {
				stack.push(b);
			}
		}
		System.out.println(stack);
	}
	public static void main (String[] args)  { 
		System.out.println("Please enter a number to find its greatest prime factor.");
		Scanner input = new Scanner(System.in);
		Long n = input.nextLong();
		System.out.println("Entered: " + n);
		primeFactors(n); 
		input.close();
	} 
} 

