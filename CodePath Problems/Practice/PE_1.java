/*Source: https://projecteuler.net/problem=1
* Author: Giancarlo Garcia Deleon
* Problem: Multiples of 3 and 5 - Problem 1
* Description: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class PE_1 {

    public static void main(String[]args){
        // UNDERSTAND - Natural Numbers -> the positive integers (whole numbers) 1, 2, 3
        // multiples of 3 or 5
        // Sum of natural numbers below 10 is
        // 3, 5, 6, 9 -> Sum = 23
        // MATCH - Never seen before
        // PLAN 
            // Simple iteration of natural and divisble (3 or 5) numbers, Sum them from 1-1000
        // IMPLEMENT
        int max = 1000;
        int sum = 0;
        int div1 = 3;
        int div2 = 5;

        for (int i = 2; i < max; i++){
            if (i % div1 == 0 || i % div2 == 0){
                // add to a sum
                sum += i;
            }
        }
        System.out.println(sum);
        // REVIEW 
            // max = 10, sum =23, max=1000, sum=233168
        // EVALUATE 
            //- O(n), Future: Only use the i values of numbers that are divisible
    }
}