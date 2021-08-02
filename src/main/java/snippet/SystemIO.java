package snippet;
import java.util.Scanner;
public class SystemIO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer followed by a double and a string.");
        System.out.print("Entered Integer : " + scan.nextInt() + "\n");
        System.out.print("Entered Double : " + scan.nextDouble() + "\n");
        System.out.print("Entered String : " + scan.next() + "\n");
        scan.close();
    }
}

