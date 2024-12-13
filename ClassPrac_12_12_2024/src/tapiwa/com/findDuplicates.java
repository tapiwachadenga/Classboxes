package tapiwa.com;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicates {

	public static void main(String[] args)
	{
		List<Integer> nums = List.of(111, 333, 555, 777, 333, 444, 555, 333);
		
		System.out.printf("getDuplicates(%s) = %s", nums.toString(), getDuplicates(nums).toString());
	}
	
	public static Set<Integer> getDuplicates(List<Integer> arr)
	{
		Set<Integer> duplicates = new HashSet<>();
		
		for(int i = 0; i < arr.size(); i++)
			for(int j = 0; j < arr.size(); j++)
				if(i != j && arr.get(i).equals(arr.get(j)))
					duplicates.add(arr.get(i));
		return duplicates;
	}
}
