package hackerrank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
// input: ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
// output: 3

public class SalesByMatch {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        System.out.println("There are " + sockMerchant(array.size(), array) + " amount of pairs");
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        if (n < 1) return 0;
        int numberOfPairs = 0;
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : ar){
            if (set.contains(num)){
                numberOfPairs++;
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return numberOfPairs;
    }
}
