package unchecked;

public class Counterwithcommaseparator {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        for (int i = a; i < b; i++) {
            System.out.print(i + ",");
        }
        System.out.print(b); //Prints the last number
    }
}
