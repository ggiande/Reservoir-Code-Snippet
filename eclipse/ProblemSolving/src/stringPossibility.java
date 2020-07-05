
/* 	Author: Giancarlo Garcia Deleon
* 	Date: 11/13/2019
* Tests wether character arrays can form given strigs.
*/
import java.util.ArrayList;

class stringPossibility{
    public static void main(String[] args) {
        /* Infield Variables */ 
        String S = "";
        StringBuilder sb = new StringBuilder();

        ArrayList<Character> list = new ArrayList<>();
        list.add('w'); list.add('o'); list.add('r'); list.add('d'); list.add('s'); list.add('f'); list.add('c'); list.add('l');

        /* Checks if string is empty */
        if(S.length() == 0){
            System.out.println("Empty");
            System.exit(1);
        }

        for(int i = 0; i <= S.length()-1; i++){
            if(list.contains(S.charAt(i))){
                sb.append(S.charAt(i));
            }
        }
        /* Checks to see if original string matches the string that can be construucted given the characters. */
        if(sb.toString().equals(S)){
            System.out.println("TRUE");
            System.out.println("S: " + S + " : " + sb.toString());
        } else {
            System.out.println("FALSE");
            System.out.println("S: " + S + " : " + sb.toString());
        }
    }
}