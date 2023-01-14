package unchecked;

public class Fibonacci {
    /**
     * Retrieves the Fibonacci Sequence's Number.
     *
     * @param targetNumber This is the X number of the Fibonacci Sequence
     * @return Returns the value of the X number
     */
    public static int fibonacciSequence(int targetNumber) throws IllegalArgumentException {

        if (targetNumber < 0) {
            throw new IllegalArgumentException();
        }
        if (targetNumber == 0) {
            return 0;
        }

        int first = 0;
        int second = 1;
        int third;

        for (int i = 0; i < targetNumber - 1; i++) {
            third = second;
            second = first + second;
            first = third;
        }
        return second;
    }
}
