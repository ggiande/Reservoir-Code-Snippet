import java.util.*;

public class reverseList {
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5,6,7};
		reversethelist(arr);
		
	}
	public static void reversethelist(int [] arr) {
		ArrayList<Integer> reversedList = new ArrayList<Integer>();
		
		for(int i = arr.length -1; i >= 0; i--) {
			reversedList.add(arr[i]);	
		}
		System.out.println(reversedList);
	}
}
