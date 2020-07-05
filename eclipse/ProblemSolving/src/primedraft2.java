
public class primedraft2 {

	public static void main(String[] args) {
		double num = 5;
		boolean prime = true;
		double counter = 0;
		while(counter  <= 10001) {
			num++;
			for(double i = 2; i <= num / 2; i++) {	//range between 3 and the length of half of the number.
				if(num % i == 0) {
					//System.out.println(num + " is not prime because it is divisible by " + i);
					prime = false;
					break;
					
				} else if(num % i != 0) {		//has remainders, is not divisible.
					continue;
				}
				
				
			}	
			if(prime == true) {
				System.out.println(num +  " is prime.");
				System.out.println("counter " + counter);
				counter++;
				}
			//System.out.println(num);
		}
	}
}
//System.out.println(num + " is not a prime number because it is divisible by " + i);