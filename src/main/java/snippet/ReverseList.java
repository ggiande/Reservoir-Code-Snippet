package snippet;
import java.util.*;
public class ReverseList {
	public static void main(String [] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		reverseList(arr);
	}
	public static void reverseList(int [] arr) {
		ArrayList<Integer> reversedList = new ArrayList<>();
		for(int i = arr.length -1; i >= 0; i--) {
			reversedList.add(arr[i]);	
		}
		System.out.println(reversedList);
	}
}
