import java.util.Scanner;

public class Menus {
    

    DrawTriangles triangle = new DrawTriangles();

    // This method prompts the user to select the size of the triangles to print out
    public void prompt() {
        int choice;

        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Please enter an integer value between 3 and 9, or 0 to quit: ");
            choice = keyboard.nextInt();
            System.out.println();

            // Check that input is between 3 & 9, inclusive
            if ((choice >= 3) && (choice <= 9)) {
                triangle.triangle1(choice);
                triangle.triangle2(choice);
                triangle.triangle3(choice);
                triangle.triangle4(choice);
            }
            // Display error at any non-expected input
            else if (choice != 0)
                System.out.println("Invalid input.");

        } while (choice != 0);

        System.out.println("Exiting program.");

        keyboard.close();

    } // end prompt

} // end Menus class