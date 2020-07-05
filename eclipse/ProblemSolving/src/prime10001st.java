
public class prime10001st {

	public static void main(String[] args) {
		int num = 1001;
		/*
		 * First loop checks to see if the numberm is even.
		 * Note: All prime numbers are odd.
		 */
		if(num % 2 == 0) {
			System.out.println(num + " is not a prime number because it is even. ");		
		} else {
			System.out.println("We know that the number is not an even number.");
			for(int i = 3; i <= num - 1; i++) {
				//System.out.println("This is where i is: " + i);
				if(num % i != 0) {
					//System.out.println(num + "is a prime number.");
					continue;

				} else {
					System.out.println(num + " is not a prime number because it is divisible by " + i);
				}
				
				if(num -1  == i) {
					System.out.println(num + "is a prime number");
				}
				/* Any code must go before the i++ for
				 * it is designed to skip over one iteration to 
				 * only check for odd numbers.
				 */
				i++;

			}
		}
		
	}
}
