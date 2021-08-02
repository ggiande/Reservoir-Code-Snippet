package unchecked;

public class Fibonnaci {
	public static void main(String [] args) {
		int MAX = 1000;
	    int first = 0;
	    int second = 1;
	    int third = second;
	    System.out.println(second);
	    while(first + second < MAX){
	        third = first + second;
	        first = second;
	        second = third;
	        System.out.println(third);
        }
    }
}
