package snippet;
import java.util.ArrayList;

public class DoubleList {
	public static void main(String [] args) {
    int[] arr = {1,2,3,4,5,6,7};
    ArrayList<Integer> DoubledList = new ArrayList<>();
		for (int i : arr) {
			DoubledList.add(i);
			DoubledList.add(i);
		}
	    System.out.println(DoubledList);
	}
}
