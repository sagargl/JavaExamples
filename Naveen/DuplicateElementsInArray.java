package Naveen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		String infra[]= {"Amazon", "Azure","Java","Net","Amzaon","Azure","Java","Netapps"};
		
		//1. Brute force
		//2. Hashset
		//3. Hashmap<K,V>
		//4. Strems
		
		
		//Brute force
		System.out.println("************Brute force***********");
		for(int i=0; i<infra.length; i++)
		{
			for(int j=i+1; j<infra.length; j++)
			{
				if(infra[i].equalsIgnoreCase(infra[j]))
				{
					System.out.println(infra[i]);
				}
			}
		}
		
		//Hashset
		System.out.println("************Hash Set***********");
		Set<String> data=new HashSet<String>();
		for(String e : infra)
		{
			if(data.add(e)==false)//If data is not available will give to true. Else it will false
			{
				System.out.println(e);
			}
			
		
			//HashMap
			System.out.println("************Hash Map***********");
			
			Map<String, Integer> inframap=new HashMap<String, Integer>();
			for(String e1 : infra)
			{
				Integer count=inframap.get(e1);
				if(count==null)
				{
					inframap.put(e1, 1);
				}
				else
				{
					inframap.put(e, ++count);
				}
			}
			
		
		
		//print all duplicate elements
			System.out.println("Duplicate elements using ");
		Set<Entry<String, Integer>> entryset=inframap.entrySet();
		for(Entry<String, Integer> entry : entryset)
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey());
			}
		}
	}
		
		//Streams set and filter
		System.out.println("**************Stream*************");
		Set<String>dataset1=new HashSet<String>();
		Set<String> dupset=Arrays.asList(infra).stream().filter(e->!dataset1.add(e)).collect(Collectors.toSet());
		System.out.println(dupset);
}
}