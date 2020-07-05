//import java.util.Scanner;
import java.util.Scanner;
//import java.util.Stack;
public class reverseinteger {
	
	public static void main(String[] args) {
    	//Stack<Integer> stack = new Stack<Integer>();
    	System.out.println("Reverse this number: ");
    	Scanner sc = new Scanner(System.in);
    	//int x = sc.nextInt();

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
		   int reversedInt = Integer.parseInt(result);
		   return reversedInt;
		}
}