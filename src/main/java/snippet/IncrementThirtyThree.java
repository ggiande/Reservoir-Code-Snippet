package snippet;
public class IncrementThirtyThree {
	public static void main(String[] args) {
		for(int i = 33; i < 1000; i++) {
			System.out.println("Currently at: " + i);
			i += 33;
			i--;
		}
	}
}