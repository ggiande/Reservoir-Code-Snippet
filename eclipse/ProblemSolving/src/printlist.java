
public class printlist {
	public static void main(String [] args) {
		read();
	}
	public static void read() {
		String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
		for(int i =0; i < toppings.length; i++) {
			System.out.println(toppings[i]);
		}
	}
}
