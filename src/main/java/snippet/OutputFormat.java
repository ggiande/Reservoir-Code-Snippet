package snippet;

/*  HackerRank: Java Output Formatting
 *   Author: Giancarlo Garcia Deleon | ggiande
 *   Date: 11/13/2019
 *   Program fiddles with java's outputting format.
 */
public class OutputFormat {
    public static void main(String[] args) {
        String s1 = "JavaIsCool";
        int x = 1000;
        int counter = 0;
        StringBuilder sb = new StringBuilder(s1);
        int i = 0;
        appendString(x, counter, sb, i);
    }

    private static void appendString(int x, int counter, StringBuilder sb, int i) {
        while (i < sb.length() && sb.charAt(i) != ' ') {
            counter++;
            i++;
        }
        for (int j = 1; j <= (15 - counter); j++) {
            sb.append(" ");
        }
        System.out.print(sb);
        if (x < 100 && x > 9) {
            // if 99 -> 099
            System.out.println("0" + x);
        } else if (x < 10) {
            System.out.println("00" + x);
        } else {
            System.out.println(x);
        }
    }
}