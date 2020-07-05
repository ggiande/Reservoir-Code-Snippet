import java.util.Scanner;

public class PalindromeInput {
	public static void main(String [] args) {
		String targetword;
    	System.out.print("Enter any string: ");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine().toLowerCase().replaceAll("\\W", "");
        
        	do {
        	   targetword = in.nextLine();
        	   
        	   PalindromeChecker.evaluator(inputString);
       		
           } while (!targetword.equals("q"));
    		in.close();
        	}
	}

