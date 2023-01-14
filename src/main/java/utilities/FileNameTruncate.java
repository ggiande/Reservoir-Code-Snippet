package utilities;

import java.util.Scanner;
import java.awt.datatransfer.Clipboard;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class FileNameTruncate {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();

        while (true) {
            String inputString = sc.nextLine();
//            lower case
            inputString = inputString.toLowerCase().trim();
            System.out.println(inputString + ": After trimming and lowering");
//            str = str.replaceAll("\\s", "");
            inputString = inputString.replaceAll("\\s", "-");
            inputString = inputString.replaceAll(":", "");
            inputString = inputString.replaceAll("---", "-");
            inputString = inputString.replaceAll("--", "-");
            inputString = inputString.replaceAll("#", "");
//            inputString += ".zip";
            inputString += ".pdf";
            StringSelection data = new StringSelection(inputString);
            System.out.println(inputString);
            c.setContents(data, data);


        }
    }
}
