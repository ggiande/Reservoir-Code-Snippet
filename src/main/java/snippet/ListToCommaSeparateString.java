package snippet;

import java.util.Arrays;
import java.util.List;

public class ListToCommaSeparateString {
	public static void main(String [] args){
		List<String> stringList = Arrays.asList("A","B","C","D");	
		String commaSeparatedString = String.join(",", stringList);
		System.out.println(commaSeparatedString);

		String[] cities = {"San Francisco", "New York", "Chicago", "Honolulu"};
		String commaSeparatedStringCities = String.join(", ", cities);
		System.out.println(commaSeparatedStringCities);
	}
}
