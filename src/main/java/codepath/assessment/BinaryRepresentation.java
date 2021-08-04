package codepath.assessment;

public class BinaryRepresentation {
    // Write a method that returns a binary representation of an integer as a string
    // EX: 7 -> 111
    public static void main(String[] args) {
        System.out.println("7 : " + convertBinary(7));
    }
    public static String convertBinary(int num){
        int[] binary = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num /= 2;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = index - 1; i >= 0; i--){
            sb.append(binary[i]);
        }
        return sb.toString();
    }
}