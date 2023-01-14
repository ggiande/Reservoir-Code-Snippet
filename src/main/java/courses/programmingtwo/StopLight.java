package courses.programmingtwo;

import java.util.Scanner;

public class StopLight {
    public static void main(String[] args) {
        char light, camera;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Hello. Welcome to StopLight! Please choose from the following " +
                    "options.\n");
            System.out.println("What color is the stoplight? (R, G, Y):");

            // ALL INPUT COMES IN ALL LOWERCASE, PREVENTING THE NEED FOR EXTRA CODE
            light = Character.toLowerCase(keyboard.next().charAt(0));

            // CHANGED SOME PRINTING STATEMENTS, REMOVED UPPERCASE ENTRIES
            switch (light) {
                case 'g':
                    System.out.println("GO");
                    System.exit(0);
                case 'y':
                    System.out.println("YIELD");
                    System.exit(0);
                case 'r':
                    System.out.println("Is there a camera on top of the streetlight? (Y,N):");

                    // ALL INPUT COMES IN ALL LOWERCASE, PREVENTING THE NEED FOR EXTRA CODE
                    camera = Character.toLowerCase(keyboard.next().charAt(0));
                    if (camera == 'y')
                    {
                        System.out.println("STOP");
                        System.exit(0);
                        // ADDED SYSTEM EXIT
                    } else if (camera == 'n') {
                        System.out.println("NO CAR NO STOP");
                        System.exit(0);
                        // ADDED SYSTEM EXIT
                    } else {
                        System.out.println("Invalid input. Please try again.");
                        System.exit(0);
                        // ADDED SYSTEM EXIT
                    }
            }
            // THE PREVIOUS OR STATEMENTS WOULD NOT BE CHECKED AT THE FIRST ITERATION
            // WE CAN LEAVE THIS CONDITIONAL AS TRUE AND WRITE SOMETHING INSIDE THAT CHECKS IF
            // LIGHT IS NOT R,Y,G
        } while (true);
    }
}
