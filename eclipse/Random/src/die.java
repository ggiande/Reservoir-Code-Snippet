import java.util.Random; 
public class die {
	public static void main(String [] args){
		Random rand = new Random(); 
		int value = rand.nextInt(50);
		System.out.println("The number is " + value + "." );
	}
}