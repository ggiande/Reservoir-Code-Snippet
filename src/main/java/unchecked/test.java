
package unchecked;

public class test {

	public static void main(String [] args) {
		recur(2,10);
	}
	public static void recur(int x, int y) {
		System.out.println(x + " " + y);
		x++;
		if(y < 3) {
			return;
		}
		x = x + y;
		recur(x,y-2);
		System.out.println(x+" "+y);
	}
	
}
