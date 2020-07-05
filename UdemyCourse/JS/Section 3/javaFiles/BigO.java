package javaFiles;

// import java.io.Console;
// import java.util.ArrayList;

// public class findingnemo {
//     // private static findingnemo findingnemo;
//     ArrayList<String> nemo = new ArrayList<>();

//     nemo.add("Nemo");

//     public findingnemo(String[]) {
//         int x = 5;
//         for (i = 0; i <= array.length; i++) {
//             if (array[i] == "Nemo") {
//                 System.out.println("Nemo has been Found!");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         findingnemo do = new findingnemo(nemo);
//     }

// }

// package java;

// import java.util.ArrayList;

// public class findingnemo {
//     // private static findingnemo findingnemo;
//     ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

//     cars.add("Ree");

// public findingnemo(String[] newNemo) {
//     ArrayList<String> newNemo = nemo;
// }

// public static void main(String[] args) {
//     findingnemo do = new findingnemo(initialNemo);
//     do.findNemo();
// }

// public void findNemo() {
//     for (i = 0; i <= nemo.length; i++) {
//         if (nemo[i] == "Nemo") {
//             System.out.println("Nemo has been Found!");
//         }
//     }
// }
// }

// import java.util.ArrayList;

public class BigO {
    public static void name() {
        int array[] = { 0, 1, 2, 3, 4, 5 };
        System.out.println(array[0]); // O(1)
        System.out.println(array[1]); // O(2)
    }

    public static void main(String[] args) {
        name(); // O(2) -> Lower Order O(1)
    }
}
