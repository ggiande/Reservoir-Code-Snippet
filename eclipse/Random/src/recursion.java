
//infinite so it crashes.
public class recursion {
	int func(int n) {
		int result;

		result = func(n - 1);

		return result;
	}

	public static void main(String args[]) {

		recursion obj = new recursion();
		System.out.print(obj.func(12));

	}

}
