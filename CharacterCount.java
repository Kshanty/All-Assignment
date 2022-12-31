package week1.day2;

import java.util.Iterator;

public class CharacterCount {

	public static void main(String[] args) {

		String company = "hexaware";
		char expected = 'e';
		char[] Array = company.toCharArray();
		int count = 0;
		for (int i = 0; i<Array.length; i++)
		{
			if(Array[i] == expected)
			{
				count++;
				
			}
		}
			System.out.println("Number of e's  :"+count);
		
	}

}
