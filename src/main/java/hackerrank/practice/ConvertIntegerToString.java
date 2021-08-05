package hackerrank.practice;

public class ConvertIntegerToString {

    public static void main(String[] args) {
        // Given an Integer, convert it into a String
        int n = 90;
        String s = integerConverter(n);
        System.out.println(s);

    }
    public static String integerConverter(int integer) {
        return Integer.toString(integer);
    }
}
