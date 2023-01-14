package snippet;

import java.util.logging.Logger;

public class IncompletePrime10001st {
    private static final Logger log = Logger.getLogger(IncompletePrime10001st.class.getName());

    public static void main(String[] args) {
        int num = 2;
        int target = 5;
        /*
         * First loop checks to see if the number is even.
         * Note: All prime numbers are odd.
         */
        System.out.println(num + " is a prime number: " + validatePossiblePrimeNumber(num));
        findXPrime(target);
    }

    private static boolean validatePossiblePrimeNumber(int num) {
        if (num % 2 == 0 && num != 2) {
            log.info(num + " is not a prime number because it is even.");
            return false;
        }
        for (int i = 3; i <= num - 1; i++) {
            if (num % i == 0) {
                log.info(num + " is not a prime number because it is divisible by " + i);
                break;
            }
            i++; // Increment by 1, because prime numbers can only be odd
        }
        return true;
    }

    // TODO: findXPrime does not successfully find the prime number
    private static void findXPrime(int num) {
        int currentPrimeNumberCounter = 0;
        int currentPrimeNumber = 0;

        // while my currentPrimeNumberCounter is not the xth prime number, keep finding prime numbers
        int i = 2;
        while (currentPrimeNumberCounter != num) {
            if (num % i != 0) {
                currentPrimeNumber = i;
                currentPrimeNumberCounter++;
            }
            i++; // Increment by 1, because prime numbers can only be odd
        }
        System.out.println("The " + num + " prime number: " + currentPrimeNumber);
    }
}
