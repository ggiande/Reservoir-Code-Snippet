
public class sumsquaredifference {
	public static void main(String [] args) {
		/* Sum of the squares of the first ten natural number
		 * 
		 */
		long sum = 0;
		long total = 0;
		long temp;
		for(long i = 0; i <= 100; i++) {
			temp = i * i;
			sum = sum + temp;
			total = total + i;
		}
		System.out.println("Sum of the squars of the first ten natural numbers: " + sum);
		System.out.println("Square of the sum of the first ten natural numbers: " + (total * total));
		System.out.println("The difference between the sum of the squares of the first ten natural numbers and the square of the sum: " + ((total * total) - sum));
	}
}
