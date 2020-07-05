public class TwoDArrayPrint {
    public static void main(String[] args) {
        int[][] myArray = new int[3][3];

        myArray[0][0] = 5;

        myArray[2][1] = 2;

        myArray[0][2] = 3 + myArray[0][0];

        for (int i = 0; i < myArray.length; i++) {

            for (int j = 0; j < myArray[0].length; j++) {

                System.out.print(myArray[i][j] + " ");

            }

            System.out.println();

        }
    }
}