import java.util.ArrayList;

public class DoubleList {
	public static void main(String [] args) {
    int arr[] = {1,2,3,4,5,6,7};
    ArrayList<Integer> DoubledList = new ArrayList<Integer>();
    
	    for(int f = 0; f < arr.length; f++){
	    	DoubledList.add(arr[f]);
	    	DoubledList.add(arr[f]);
	       }
	    System.out.println(DoubledList);
	}
}
