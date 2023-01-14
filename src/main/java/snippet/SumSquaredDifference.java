package snippet;

public class SumSquaredDifference {
    public static void main(String[] args) {
        // Sum of the squares of the first ten natural numbers
        long sum = 0;
        long total = 0;
        long naturalNumber = 10;
        for (long i = 0; i <= naturalNumber; i++) {
            sum += i * i;
            total += i;
        }
        total *= total;
        System.out.println("Sum of the squares of the first ten natural numbers: " + sum);
        System.out.println("Square of the sum of the first ten natural numbers: " + total);
        System.out.println("The difference between the sum of the squares of the first ten natural numbers and the square of the sum: " + (total - sum));
    }
}
