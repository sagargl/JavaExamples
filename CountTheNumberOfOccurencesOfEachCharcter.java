

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CountTheNumberOfOccurencesOfEachCharcter {
	public static void main(String[] args) {
		String s="navneet";
		char[]strArray=s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for( char c: strArray)
		{
			
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
				else
				{
					hm.put(c, 1);
				}
			}
		System.out.println("Inputstring"+hm);

		//print all duplicate elements
		System.out.println("Duplicate elements using ");
	Set<Entry<Character, Integer>> entryset=hm.entrySet();
	for(Entry<Character, Integer> entry : entryset)
	{
		if(entry.getValue() > 1)
		{
			System.out.println(entry.getKey());
		}
	}
	

	
	
	int a[]= {10,20,30,10,30,40,50,30,20,10};
	HashMap<Integer,Integer> hmap1=new HashMap<Integer, Integer>();
	{
		for(Integer a1: a)
		{
			if(hmap1.containsKey(a1))
			{
				hmap1.put(a1, hmap1.get(a1)+1);
				
			}
			else
			{
				hmap1.put(a1, 1);
			}
			
		}
		System.out.println("InputString"+hmap1);
		
		
	}
	}
}


