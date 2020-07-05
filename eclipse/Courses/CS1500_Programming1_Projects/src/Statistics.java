import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Name: Giancarlo Garcia Deleon Last Updated: 11/29/2018 Project 4: Statistics
 * This program takes in the filename that a user inputs and displays the amount
 * of numbers inside the file as well as the average of the data set.
 */
public class Statistics {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Please present a readable file."); // Asks for [user input] - Name of the file
		Scanner console = new Scanner(System.in); // Reads [user input]
		String filename = console.next(); // [Adds] file to the console

		Scanner input = new Scanner(new File(filename)); // [Calculation] Scanner
		Scanner input2 = new Scanner(new File(filename)); // [Prints] the numbers and says amount

		double sum = 0.0;
		double first = input.nextDouble(); // Declares [number of indexes] as well as skips the 1st data point
		double second = input2.nextDouble();

		System.out.println("There are " + second + " numbers in this file.");

		while (input.hasNextDouble()) { // [Prints] Array
			sum = sum + input.nextDouble();
			System.out.print(input2.nextDouble() + " ");
		}

		double mean = sum / first; // [Calculates] the Average/Mean
		System.out.println("\nThe sum is: " + sum);
		System.out.println("\nThe mean is: " + mean + "\nThanks!");
		console.close();
		input.close();
		input2.close();
	}
}