package hackerrank;
import java.util.Scanner;
public class JavaStaticInitializerBlock {
    static Scanner scan = new Scanner(System.in);
    public static int B = scan.nextInt();
    public static int H = scan.nextInt();
    public static void main(String[] args) {
        if (B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(B*H);
        }
    }
}