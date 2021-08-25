package HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEntryKeySet {
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(80,"sagar");
		map.put(70,"arvind");
		map.put(90,"shim");
		map.put(40,"java");
		map.put(60,"test");
		map.put(80,"sss");
		
		
		/*** For Keyset using loops*****/
		Set<Integer> keys=map.keySet();
		for(Integer key : keys)
		{
			System.out.println( " Keys are " +map.get(key));
		}
		
		/* Displaying the Hashmap using keyset*/
		System.out.println("Initial mappings are"+map);
		System.out.println("The keyset is"+map.keySet());
		
		
		
		/*** For Entryset without loops***/
		System.out.println("The entryset is" +map.entrySet());
		/**** For EntrySet using loops****/
		Set<Entry<Integer, String>>keys1=map.entrySet();
		for(Entry<Integer, String> entry: keys1)
		{
			System.out.println("values is"+entry);
			
		}
	
		
	}

}
