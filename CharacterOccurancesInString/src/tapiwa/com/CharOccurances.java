package tapiwa.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

public class CharOccurances {

	private static final String Collectors = null;

	public static void main(String[] args)
	{
		String str = "Java J2EE Java JSP J2EE";
		
	}
	
	/*
	public static HashMap<Character, Integer> CharFrequencyMap(String str)
	{
		/* HashMap<Character, Integer> mapper = new HashMap<>();
		
		return Arrays.stream(str.toCharArray()
				//.boxed()
				.collect(Collectors,groupingBy(
						Function.identity(),
						Collectors.counting()
						));
		
		//return mapper;
		 
		 
		
		IntStream.range(0, str.toCharArray().length).
			.mapToObj(i -> str.toCharArray()[i])
			.collect(())
		)
	}
*/
}
