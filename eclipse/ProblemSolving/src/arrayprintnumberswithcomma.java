
public class arrayprintnumberswithcomma{
	public static void main(String [] args) {
		String sep = "";

		//int arr [] = {0,1,2,3,4};
		String arr2 [] = {"San Francisco", "New York", "Chicago", "Honolulu"};
		for(int i = 0; i <= arr2.length; i++) {
		    System.out.print(sep + i);
		    sep = ",";
		}
	}
}

