package courses.programmingtwo;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
/**
 * Name: Giancarlo Garcia Deleon
 * Last Updated: 2/20/2019
 * Project 1: Standard Deviation
 * This program takes in the filename that a user inputs and displays the amount
 * of numbers inside the file as well as the data set from an array. In addition,
 * it can now calculate the Standard Deviation of the data set.
 */
public class Project1 {
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Please present a readable file.");
		Scanner file = new Scanner(System.in); 							// Read user input in relative path
	 	String filename = file.next();									//Reads for file name
	 	Scanner indexes = new Scanner(new File(filename)); 
	 	int y = indexes.nextInt(); //Holder for array length
	 	//System.out.print("There are " + y +" numbers in this file.\n");
	 	double [] arr = new double[y];	 	
	 	for(int i = 0; i < y; i++){ 									//Places all doubles into an array.
	 		arr[i] = indexes.nextDouble();
	 		//System.out.print(arr[i] + " ");	
	 	}
	 	Scanner s = new Scanner(new File(filename));					//Begin new scanner for calculations for sum and mean.
		s.nextDouble();
		double sum = 0.0;
		for(int i = 0; i < y; i++) {
			sum = sum + s.nextDouble();
		}
		//System.out.println("\nThe sum is: " + sum);
		double mean = sum/y;
		System.out.println("The mean is: " + mean);
		
        double temp = 0;												//Calculating Variance
        for(double a :arr)												//Advanced for loop that acts on every index
            temp += (a - mean) * (a - mean);							//temporary bank for variance
        double variance = temp / (y - 1);			
        double SD = Math.sqrt(variance);
        DecimalFormat money = new DecimalFormat("######.000"); //Formatter for output
		System.out.println("The Standard Deviation is: " + money.format(SD));
		
		s.close();
		file.close();	
	 	indexes.close();
	}
}