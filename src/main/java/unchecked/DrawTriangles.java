package unchecked;

public class DrawTriangles {
    private int stars, lines, spaces;

    // This method draws the first triangle
    public void triangle1(int choice) {
        for (lines = 1; lines <= choice; lines++) {
            for (stars = 1; stars <= lines; stars++) {
                System.out.print('*');
                // System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();

    } // end drawTriangle1

    // This method draws the second triangle
    public void triangle2(int choice) {
        for (lines = choice; lines >= 1; lines--) {
            for (stars = 1; stars <= lines; stars++) {
                System.out.print('*');
                // System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();

    } // end drawTriangle2

    // This method draws the third triangle
    public void triangle3(int choice) {
        for (lines = 1; lines <= choice; lines++) {
            // Align the stars to the right
            for (spaces = choice; spaces > lines; spaces--) {
                System.out.print(' ');
                System.out.print(' ');

            } // end spaces

            for (stars = 1; stars <= lines; stars++) {
                System.out.print('*');
                System.out.print(' ');

            } // end stars

            System.out.println();
        }
        System.out.println();

    } // end drawTriangle3

    // This method draws the fourth triangle
    public void triangle4(int choice) {
        for (lines = choice; lines >= 1; lines--) {
            // Align the stars to the right
            for (spaces = choice; spaces > lines; spaces--) {
                System.out.print(' ');
                System.out.print(' ');
            }
            for (stars = 1; stars <= lines; stars++) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();

    } // end drawTrianlge4

} // end Triangles class
