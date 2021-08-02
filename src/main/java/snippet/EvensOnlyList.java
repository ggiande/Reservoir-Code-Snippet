package snippet;

import java.util.ArrayList;
public class EvensOnlyList {
	public static void main(String [] args) {
		int[] list = {1, 2, 3, 4, 5, 6, 7}; 			//Original Array with Integers in it
        ArrayList<Integer> evens = new ArrayList<>();	//ArrayList that is what will be printed and allows for append
		for (int j : list) { //For every integer in the list
			if (j % 2 == 0) {                    //Checks for evens
				evens.add(j);                    //appends the evens into the array list named evens
			}
		}
		System.out.println(evens);
	}
}





