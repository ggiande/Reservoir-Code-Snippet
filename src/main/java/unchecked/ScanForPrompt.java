package unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanForPrompt {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int size = -1;
		while(size < 0) {
			try {
				System.out.println("Please enter the size of the pizza in inches: (e.g 12, 15, 6) ");
				size = keyboard.nextInt();
			} catch (InputMismatchException ex) {
				keyboard.next();
			}
		}
		System.out.println("The pizza is " + size + " inches long.");
		
		double price = -1;
		while(price < 0.0) {
			try {
				System.out.println("Please enter the price of the pizza. (e.g. 15.99, 16)");
				price = keyboard.nextDouble();
			} catch (InputMismatchException ex) {
				keyboard.next();
			}
		}
        System.out.println("The price of the pizza was: " + price);
		
		int amount = -1;
		while(amount < 0.0) {
			try {
				System.out.println("Please enter the amount of pizzas that will be purchased.");
				amount = keyboard.nextInt();
			} catch (InputMismatchException ex) {
				keyboard.next();
			}
		}
        System.out.println("You have purchased " + amount + " pizzas.");
		
		
		
		keyboard.close();
	}
}
