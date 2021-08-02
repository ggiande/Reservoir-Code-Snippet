package snippet;
import java.util.Scanner;
public class nestedifstrucutre {
	public static void main(String [] args) {
		double[] input = {1.0, 2.0, 3.0, 4.0, 5.0};
		double sum = 0.0;
		double numTotal = input.length;
		for (double num: input) {
			sum += num;
		}
		double mean = sum / numTotal;
		System.out.println("The mean is: " + mean);
	}
}

