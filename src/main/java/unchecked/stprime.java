package unchecked;/* CHECK FOR PRIME NUMBERS BETWEEN TWO GIVEN ITERVALS*/

import java.util.*;

public class stprime{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive integers");
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (int j = a; j <= b; j++) {
            // System.out.println("Sent: " + a);
            isPrime(a);
            if (isPrime(a) == true) {
                System.out.println(a + " is a prime number.");

            } else if (isPrime(a) == false) {
                // System.out.println(a + " is not a prime number.");
            }
            // System.err.println("j is: " + j);
            // System.out.println("b is: " + b);

            a++;
        }

        scan.close();
    }

    public static boolean isPrime(int a) {
        if (a % 2 == 0 && a != 2) {
            // System.out.println(a + " is even and not 2, so it's not a prime number. ");
            return false;
        } else if (a == 2 || a == 3) {
            // System.out.println(a + " is a prime number.");
            return true;
        }

        // int factor = 0;
        for (int i = 3; i < a - 1; i++) {
            if (a % i == 0) {
                // factor++;
                /// System.out.println("a is: " + a + " and i is: " + i + " calc: " + (a % i));
                return false;
                // System.out.println(a + " is not a prime number because it was divisible by "
                // + factor + " numbers.");
            }
            // System.out.println(factor);

        }
        return true;

    }

}