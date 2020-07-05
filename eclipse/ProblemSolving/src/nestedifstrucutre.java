import java.util.Scanner;

public class nestedifstrucutre {
	public static void main(String [] args) {
		Scanner in = new Scanner("InputFile");
		
		double sum = 0.0;
		double numTotal = in.nextDouble();
		while(in.hasNextDouble()) {
			double nextDouble = in.nextDouble();
			sum = sum + nextDouble;
		}
		double mean = sum / numTotal;
		System.out.println("The mean is: " + mean);
		in.close();

	}
}

