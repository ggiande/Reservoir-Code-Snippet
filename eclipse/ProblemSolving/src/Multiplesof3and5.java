/*
 * By: Giancarlo Garcia Deleon
 * Last Updated: June 3, 2019 1:54 PM
 * This program is meant to sum the multiple of 3 and 5 
 * that are below 1000.
 * 
 */
public class Multiplesof3and5 {
	public static void main (String [] args) {
		int sum = 0;
		//int num = 1000;
		
		for(int i = 0; i <= 999; i++) {
			if(i % 3 == 0|| i % 5 ==0) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
	}
}
