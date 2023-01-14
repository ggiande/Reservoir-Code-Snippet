package unchecked;

import java.util.ArrayList;
import java.util.Scanner;

//This prints the sum of 5 to the  
public class apples {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7};
        change(a);
        String[] arr = {"London", "Paris", "Berlin"};
        System.out.println(arr[2]); // Prints the called index
        printprimenumbers();
        pusharray();
        addnum();
    }

    public static void change(int[] x) { // adds 5 to each value
        for (int element : x) {
            element += 5;
            System.out.println(element);
        }

    }

    public static void printprimenumbers() { // prints indexes
        int[] numList = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        System.out.println(numList[0]);
        System.out.println(numList[2]);
        System.out.println(numList[4]);
    }

    public static void pusharray() {
        int[] arr = {1, 2};
        arr[0] = 1;
        System.out.println(arr[0]);
    }

    public static void addnum() {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        System.out.println("Enter number: ");

        Scanner number = new Scanner(System.in);
        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(22);
        arrlist.add(30);
        arrlist.add(40);

        // adding element 25 at third position
        // arrlist.add(2,25);

        // let us print all the elements available in list
        for (int x : arrlist) {
            System.out.println("Number = " + x);
            number.close();
        }
    }
}