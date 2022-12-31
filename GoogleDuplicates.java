package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class GoogleDuplicates {

	public static void main(String[] args) {

		String companyName= "google";
		char[] name = companyName.toCharArray();
		System.out.println(name);
		Set<Character> letters= new LinkedHashSet<Character>();
		
		
		for (int i=0; i<name.length; i++)
		{
			letters.add(name[i]);
		}
		
		System.out.println(letters);
		
		
	}

}
