
public class printsum {

	public static void main(String[] args) {
		int arr[] = {2,4,6,8};
		int sum = 0;
		for(int x: arr) {
			sum =+ sum + x;
		}
		System.out.println("The sum is: " + sum);
	}

}
