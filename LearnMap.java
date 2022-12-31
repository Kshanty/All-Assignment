package week3.day2;

import java.util.HashMap;
import java.util.Map;


public class LearnMap {

	public static void main(String[] args) {

		
		String company = "amazon development center";
		String replace = company.replaceAll(" ", "");
		char[] Array = replace.toCharArray();
		
		Map<Character,Integer> map =new HashMap<Character, Integer>();
	
		for (int i=0; i<Array.length; i++)
		{
			
			if(map.containsKey(Array[i]))
			{
			Integer count = map.get(Array[i]);
			map.put(Array[i], count+1);
			}else
			{
				map.put(Array[i], 1);
			}
			
		}
		
		System.out.println(map);
		
	}

}
