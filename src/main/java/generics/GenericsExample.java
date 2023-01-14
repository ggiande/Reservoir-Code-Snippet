package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        Printer<Integer, Integer> integerPrinter = new Printer<>(23, 23);
        Printer<Double, Double> doublePrinter = new Printer<>(23.0, 23.0);
        Printer<String, String> stringPrinter = new Printer<>("Twenty-Three", "Twenty-Three");
        Printer<Integer, String> integerStringPrinter = new Printer<>(23, "Twenty-Three");
        integerPrinter.print();
        doublePrinter.print();
        stringPrinter.print();
        integerStringPrinter.print();
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);
        shout(123);
    }

    private static <T> T shout(T element) {
        System.out.println(element + "!!!!");
        return element;
    }

    // Wildcard -> ? when we don't know what the generic type is going to be
    private static void printList(List<?> myList) {
        System.out.println("List: " + myList);
    }
}
