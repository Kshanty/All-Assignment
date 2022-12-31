package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesSet {

	public static void main(String[] args) {

		int[] numbers= {2,3,2,3,5,6,7,8,4,8,2,8,9,11};
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		for (int i=0; i<numbers.length; i++)
		{
			if(!unique.add(numbers[i]))
			{
				duplicates.add(numbers[i]);
			}
		}
		
		System.out.println(unique);
		System.out.println(duplicates);
	}

}
