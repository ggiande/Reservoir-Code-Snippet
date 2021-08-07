package hackerrank.practice;
import java.util.Scanner;
/*Sample Input
Hello world
I am a file
Read me until end-of-file

Sample Output
1 Hello world
2 I am a file
3 Read me until end-of-file.
*/
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while (scanner.hasNext()){
            System.out.println(counter + " " + scanner.nextLine());
            counter++;
        }
    }
}