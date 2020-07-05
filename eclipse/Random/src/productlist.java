public class productlist{
	public static void main(String [] args){
		int []arr = {2,4,6,8};
		int sum = 1;
		for(int i = 0; i < arr.length; i++){
			int curr = arr[i];
			sum = sum * curr;
		}
		System.out.println("The product is: " + sum);
	}
}