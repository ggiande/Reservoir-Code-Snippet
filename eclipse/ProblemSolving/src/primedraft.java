import java.util.Scanner;
public class primedraft {
	public static void main(String [] args) {
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		/*
		 * First statement checks to see if the number is even.
		 * Note: All prime numbers are odd.
		 */

			if(num % 2 == 0 && num != 2) {
				System.out.println(num + " is not a prime number because it is even. ");	
			} else {
				System.out.println("We know that " + num + " is not an even number or its 2, so it's probably odd. Now checking to see if it's divisble by another number.");
				
				for(int i = 3; i <= num - 1; i++) {		//We start at 3, becuas ewe already checked for 2.

					if(num % i != 0) {	//While not divisble continue 
						continue;
					} else { //Else if divisble, we know it's not a prime number
						System.out.println(num + " is not a prime number because it is divisible by " + i);
					} 
					/* Any code must go before the i++ for
					* it is designed to skip over one iteration to 
					* only check for odd numbers.
					*/
					
					i++;
				}
			}
		a.close();
	}
}
