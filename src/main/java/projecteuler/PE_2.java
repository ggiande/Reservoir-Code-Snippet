package projecteuler;

/*Source: https://projecteuler.net/problem=2
* Author: Giancarlo Garcia Deleon
* Problem: Even Fibonacci numbers - Problem 2
* Description: Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class PE_2 {
    public static void main(String[] args) {
        // UNDERSTAND - Find fibonnaci sum of 4,000,000 ONLY adding to the sum even numbers
        // Max = 10, Sum = 2 + 8 = 10 
        // MATCH - Basic Fibonnacci
        // PLAN - 1. Write the Fibonacci Sequence until 4,000,000 2. On even numbers, we add to a sum
        // IMPLEMENT
        int MAX = 4000000;
        int sum = 0;
        int prev = 1;
        int newsum = prev;
        int independentSum = 0;
        while (prev + sum < MAX) {
            newsum = prev + sum;
            prev = sum;
            sum = newsum;

            if (newsum % 2 == 0) {
                independentSum += newsum;
            }
        }
        System.out.println(independentSum);
        // REVIEW
        // int MAX = 4000000; -> 4613732
        // EVALUATE
        // Time Complexity - O(n)
        // Space Complexity - O(n)
    }
}