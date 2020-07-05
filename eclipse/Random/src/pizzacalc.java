import java.util.InputMismatchException;
import java.util.Scanner;

public class pizzacalc {
	static double price;
	static double size;
	static int amount;
	
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int amount = -1;
		while(amount < 0.0) {
			try {
				System.out.println("Please enter the amount of pizzas that will be purchased.");
				amount = keyboard.nextInt();
			} catch (InputMismatchException ex) {
				keyboard.next();
			}
		}
        //System.out.println("You have purchased " + amount + " pizza.");
		int size = -1;
		while(size < 0) {
			try {
				System.out.println("Please enter the size of the pizza in inches: (e.g 12, 15, 6) ");
				size = keyboard.nextInt();
			} catch (InputMismatchException ex) {
				keyboard.next();
			}
		}
		//System.out.println("The pizza is " + size + " inches long.");
		
		double price = -1;
		while(price < 0.0) {
			try {
				System.out.println("Please enter the price of the pizza. (e.g. 15.99, 16)");
				price = keyboard.nextDouble();
			} catch (InputMismatchException ex) {
				keyboard.next();
			}
		}
        //System.out.println("The price of the pizza was: " + price);
		
		
		
		double small;
		small = Compute(size, price, amount);
		report(small);
		keyboard.close();
	}
	
	public static double Compute(double size, double price, int amount) {
		size = size / 2;
		return amount * price / (Math.PI * size * size); //This is set to equal to Future Value
	    }
	
	public static double report(double small) {
		System.out.printf("The pizza costs approximately $%1.2f", small);	
		System.out.print(" per sqaure inch of pizza.");
		return 0.0;
	}
	

	
	
}

