import java.util.Scanner;

public class StdinandStdout2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble(); //double
        String s = new String ("");
        
        scan.nextLine();            //There appears to be a next Line before the String
        s = scan.nextLine();       //.nextLine skipped to the line and was then scanned in
       
        System.out.println ("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}

