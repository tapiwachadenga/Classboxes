package tapiwa.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutations {

	public static void main(String[] args)
	{
		String str = "aap";
		System.out.printf("strPermutations(%s): %s", str, uniqueStringPermutations(str) );
	}
	
	public static String uniqueStringPermutations(String str)
	{
		Set<String> strSet = new HashSet<>();
		for(String strElement: strPermtuationsTailRecursion(str))
			strSet.add(strElement);
		return strSet.toString();
	}
	
	public static List<String> strPermtuationsTailRecursion(String str)
	{
		List<String> strList = new ArrayList<>();
		String acc = "";
		strPermtuationsTailRecursionHelper(str, acc, strList);
		return strList;
	}
	
	public static void strPermtuationsTailRecursionHelper(String str, String acc, List<String> results)
	{
		if(str.isEmpty())
			results.add(acc);
		
		for(int i = 0; i < str.length(); i++)
		{
			String newStr = str.substring(0, i) + str.substring(i + 1);
			String newAcc = acc + str.charAt(i);
			strPermtuationsTailRecursionHelper(newStr, newAcc, results);
		}
	}
}
