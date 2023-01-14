package hackerrank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ReverseArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(reverseArray(numbers));
    }
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> array = new ArrayList<>();
        // end -> beginning
        for (int i = a.size()-1; i >= 0; i--){
            array.add(a.get(i));
        }
        return array;
    }
}