
import java.util.Arrays;
import java.util.List;

class stringBuilder {
    public static void main(String[] args) {
        /**
         * A class used to create and manipulate strings. Strings are immutable. String
         * Builder strings can be modifed after creation.
         */

        // D/f b/w replace() and replaceAll()

        List<String> trees = Arrays.asList("oak", "pine", "fir", "ash", "birch", "elm", "yew");
        System.out.println(listToString(trees));

    }

    private static String listToString(List<String> trees) {
        StringBuilder sb = new StringBuilder(32);

        for (String el : trees) {

            sb.append(el).append(" ");
        }
        return sb.toString();

        /*
         * String myString = " "; for(String el: trees){ myString += el + " ";
         * 
         * }
         */
        // return myString;

    }
}