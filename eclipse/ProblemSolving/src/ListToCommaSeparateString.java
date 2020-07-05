import java.util.Arrays;
import java.util.List;

public class ListToCommaSeparateString {
	public static void main(String [] args){
		List<String> stringList = Arrays.asList("A","B","C","D");	
		String commaSeparatedString = String.join(",",stringList);
		System.out.println(commaSeparatedString);
	}
}
