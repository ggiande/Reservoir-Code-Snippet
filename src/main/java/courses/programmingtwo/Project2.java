package courses.programmingtwo;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
/*
 * Name: Giancarlo Garcia Deleon
 * Last Updated: 2/03/2019
 * Project 1: Print File
 * This program takes in the filename that a user inputs and displays the amount
 * of numbers inside the file as well as the data set from an array.
 */
public class Project2 {
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Please present a readable file.");
		
		Scanner file = new Scanner(System.in); 								// Read user input in relative path
	 	String filename = file.next();										//Reads for file name
	 	Scanner indexes = new Scanner(new File(filename));
	 	 	
	 	int y = indexes.nextInt(); 											//Holder for array length
	 	//System.out.print("There are " + y +" numbers in this file.\n");
	 	
	 	double [] arr = new double[y];	 	
	 	
	 	for(int i = 0; i < y; i++){ 										//Places all doubles into an array.
	 		arr[i] = indexes.nextDouble();
	 		System.out.print(arr[i] + " ");									//Prints the array
	 	}	
	
		file.close();	
	 	indexes.close();
	}
}