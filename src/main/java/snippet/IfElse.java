package snippet;

import java.util.*;
public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if((N % 2 != 0)) {                                        //If odd prints weird
            System.out.print("Weird");
        } else if (N >= 2 && N <= 5) {        //even and between 2 and 5 prints not weird
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {        //even and between 6 and 20 print weird
            System.out.println("Weird");
        } else if ((N > 20 )) {                                    //even and greater than 20 print Not Weird
            System.out.print("Not Weird");
        }
        scanner.close();
    }
}
