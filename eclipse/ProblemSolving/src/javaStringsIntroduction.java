import java.util.ArrayList;
/* 
*   HackerRank: Java Strings Introduction
*   Author: Giancarlo Garcia Deleon
*   Date: 11/14/2019
*   This program first compares two strings
*   lexicographically, prints the sum of the two strings,
*   and combines both strings separated by a space after capitalizing
*   the first character in each string.
*/

class javaStringsIntroduction{
    public static void main(String[] args) {
        char[] arr = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> list = new ArrayList<>();
        for(char f: arr){
            list.add(f);
        }
        String A = "java";
        String B = "hello";

        System.out.println(A.length() + B.length());

        if(list.indexOf(A.charAt(0)) > list.indexOf(B.charAt(0)) ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //System.out.println(new StringBuilder(A).replace(0, 1, Character.toUpperCase(A.charAt(0)));

        
    
    
    }
}