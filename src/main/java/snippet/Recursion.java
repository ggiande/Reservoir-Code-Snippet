package snippet;
// Use recursion to increment until we get to 100
public class Recursion {
	public static int func(int n) {
		if (n == 100){
			return n;
		}
		System.out.println("Current Value: " + n);
		n++;
		return func(n);
	}
	public static void main(String[] args) {
		System.out.println("We reached! " + func(1));
	}
}