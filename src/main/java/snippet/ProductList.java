package snippet;

public class ProductList {
	public static void main(String [] args){
		long[] arr = {2, 4, 6, 8};
		sumProductOfList(arr);
	}

	private static void sumProductOfList(long[] arr) {
		if (arr.length == 0) {
			System.out.println("Empty Array");
			return;
		}
		long sumOfProduct = 1;
		for (long curr : arr) {
			sumOfProduct = sumOfProduct * curr;
		}
		System.out.println("The product is: " + sumOfProduct);
	}
}