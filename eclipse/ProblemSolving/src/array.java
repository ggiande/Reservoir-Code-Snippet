//import java.text.DecimalFormat;
//import java.util.Arrays;
//import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Scanner;


public class array {
	public static void main(String[]args) throws FileNotFoundException{
		
		int [] arr = {6,42,45,12,2,56,78,89,9};
		//double average = 0;
		//double sum = 0;
		
		for(int f:arr){ //does this to every single thing
			//sum += f;
			//average = sum/arr.length;
			System.out.print(" "+ f + "");
			
			
			
			
			//System.out.println("The sum is: " + sum + "\nThe number of indexes is " + arr.length);//Debugging the Calculations
		}
		//System.out.println("The numbers are: " + Arrays.toString(arr));
		//DecimalFormat money = new DecimalFormat("######.000");
		//System.out.println("The mean is " + money.format(average) + "\nThanks!");			
		
	}
}
