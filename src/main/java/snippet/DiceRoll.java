package snippet;
import java.util.Random;
public class DiceRoll {
	public static void main(String [] args){
		Random rand = new Random();
		int value = rand.nextInt(6);
		System.out.println("The number is " + value);
	}
}