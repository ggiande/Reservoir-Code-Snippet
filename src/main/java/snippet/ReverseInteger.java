package snippet;

import java.util.Scanner;
public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println("Reverse this number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = reverse(input);
		System.out.println("The reversed number is " + result);
		sc.close();
    }
	public static int reverse(int n) {
	   String input = String.valueOf(n);
	   String result = "";
	   for (int i = input.length() - 1; i >= 0; i--) {
		   result = result + input.charAt(i);
	   }
		return Integer.parseInt(result);
	}
}