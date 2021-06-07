
public class EvenFibonnaciSum {
	public static void main(String [] args) {
		int MAX = 4000000;
	    int first = 0;
	    int second = 1;
	    int third = second;
	    int sum = 0;

	    while(first + second < MAX){
	        third = first + second;
	        first = second;
	        second = third;
	        if(third %2 == 0) {
	        	sum = sum + third;
	        }
	       
        }
	    System.out.println(sum);
    }
}
