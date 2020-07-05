/*  HackerRank: Java Output Formatting 
*   Author: Giancarlo Garcia Deleon
*   Date: 11/13/2019
*   Program fiddles with java's outputting format.
*/



class outputtingFormat{
    public static void main(String[] args) {
        /* Infield Variables */

        String s1 = "JavaIsCool";
        int x = 1000;

        int counter = 0;
        StringBuilder sb = new StringBuilder(s1);
        int i = 0;
        while(i < sb.length() && sb.charAt(i) != ' '){
            counter++;
            i++;
        }
        for(int j = 1; j <= (15 - counter); j++){
            sb.append(" ");
        }
        System.out.print(sb);
        if(x < 100 && x > 9){
            // if 99 -> 099
            System.out.println(new StringBuilder().append("0" + x).toString());
        } else if (x < 10){
            System.out.println(new StringBuilder().append("00" + x).toString());
        } else {
            System.out.println(new StringBuilder().append(x).toString());
        }




    }
}