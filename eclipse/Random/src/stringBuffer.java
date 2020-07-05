
class stringBuffer {
    public static void main(String[] args) {
        /**
         * Immutable strings are unchanging over time or unable to be changed. String
         * Buffers are safe for use by multiple threads.
         * 
         * 
         **/

        // String greet = "Hello World!"; //Immutable String
        // System.out.println(greet);

        StringBuffer sBuffer = new StringBuffer("Hello World."); // Mutable String
        sBuffer.append('c'); // adds the character immediately after the end of the previous string
        // sBuffer.reverse(); //Library that reverses the string
        sBuffer.replace(0, 3, "No");
        /*
         * From index 0 > 3, replaces the characters with "No". Therefore it truncates
         * the first character. HelloWorld.c > He > NoloWorld.c
         */
        // NoloWorld.c
        sBuffer.delete(3, 4);
        // N o l o _ W o r l d . c
        // 0 1 2 3 4 5 6 7 8 9 10
        /* Removes the 3rd and 4th index, leaving Nol World.c */

        System.out.println(sBuffer);

    }
}
