import java.util.*;
//import java.math.*;
import java.text.*;
/* The second I place the Import for the math library, Oxygen runs into an error
 * I can only assume that this is because there is no need to import something already installed on
 * the oxygen platform.
*/
public class FutureValue {
	/**
	 * Name: Giancarlo Garcia Deleon
	 * Last Updated: October 24, Wednesday 7:49 PM
	 * Project 3:  Future Value of Periodic Savings
	 * This program calculates the number of deposited payments, the amount deposited,
	 * 	and the interest rate. The program will then display the amount in the account after
	 * 	the user enters all prompted information.
	 */
	static double P;
	static double R;
	static double N;
		public static void main(String[] args) {
		double FutureValue;
		PrintDirections();
		GetParameters();
    	FutureValue = Compute_FV(P,R,N);
		Report_FV(P, R, N, FutureValue);
    	}
	
	//genuinely presents the program's purpose
	public static void PrintDirections() {
		System.out.println("This program calculates the number of deposited payments, the amount deposited,\n" +
		"and the interest rate. The program will then display the amount in the account after\n" + 
		"the user enters all prompted information.\n");
	}
	
	//This obtains all of the parameters that will be calculated
	public static void GetParameters() {
		Scanner console = new Scanner(System.in);
    	System.out.print("The payment amount = ");
    	P = console.nextDouble();
    	System.out.print("The interest rate is: ");
    	R = console.nextDouble();
    	System.out.print("The number of weekly payments = ");
    	N = console.nextDouble();
    	console.close();

	}	
	
	//This computes the FV
	public static double Compute_FV(double P, double R, double N) {
		double r = R/5200;
		return (P*((Math.pow(1+r,N)-1)*(1+r)/r)); //This is set to equal to Future Value
	    } 
	//Reports the Future Value according to said format
	//Also, format is an import that was not in the textbook nor in lecture, "import java.text.*;"
	public static double Report_FV(double P, double R, double N, double FutureValue) {
         DecimalFormat money = new DecimalFormat("###,###,###,###,###,###,###,###,###,###.00");
         
         DecimalFormat percentage = new DecimalFormat("#,##0.000'%'");
		
         System.out.println("The Future Value of " + (int)N + " weekly payments of $" + money.format(P) + " at " + percentage.format(R) + " is $" + money.format(FutureValue));
		return 0.0;
	}
}