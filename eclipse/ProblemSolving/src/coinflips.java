import java.util.ArrayList;
import java.util.Random;

public class coinflips {
	public static void main(String [] args) {
		int NUM_FLIPS = 5;
		System.out.println("This program will print a set number of coin flips based on the users" + 
		" input\n");

		ArrayList<String> flips = flipcoin(NUM_FLIPS);
		printArray(NUM_FLIPS, flips);	
		countHeadsAndTails(flips);
	}
	public static ArrayList<String> flipcoin(int NUM_FLIPS) {
		ArrayList<String> flips = new ArrayList<String>(); 
		Random rand = new Random(); 

		for(int i = 0; i < NUM_FLIPS; i++) {
			int value = rand.nextInt(2); //50 50 chance of being a value
			if(value == 1) {
				flips.add("Heads");
			}else {
				flips.add("Tails");
			}
		}
		//System.out.println(flips);
		return flips; //returns new array string to be able to be printed
	}
	//Prints the flips array list that holds all the heads and tails
	public static void printArray(int NUM_FLIPS, ArrayList<String> flips ) {
		for(int i = 0; i < flips.size(); i++) {
			System.out.println(i + ":" + flips.get(i));
		}
	}
	public static void countHeadsAndTails(ArrayList<String> flips) {
		int count = 0;
		int bank = 0;
		for(int f = 0; f < flips.size(); f++) {
			if(flips.get(f) == "Heads") {
				count++;
			}else {
				bank++;
			}
		}
		System.out.println("\nHeads: " + count);
		System.out.println("Tails: " + bank);
	}
}

