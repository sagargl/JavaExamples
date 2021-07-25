package HashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class HashMapSort {
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(80,"sagar");
		map.put(70,"arvind");
		map.put(90,"shim");
		map.put(40,"java");
		map.put(60,"test");
		
		
	System.out.println("Before sortisng");
		Set set=map.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry me=(Map.Entry)iterator.next();
			System.out.print(me.getKey()+ ":");
			System.out.println(me.getValue());
			
		}
		
	/*	 Sort based on Keys*/
		Map<Integer,String>tmap=new TreeMap<Integer,String>(map);
		System.out.println("After sorting");
		Set set1=tmap.entrySet();
		Iterator iterator2=set1.iterator();
		while(iterator2.hasNext())
		{
			Map.Entry me1=(Map.Entry)iterator2.next();
            System.out.print(me1.getKey() + ": ");
            System.out.println(me1.getValue());
			
		}
		
		/*Sort based on Values*/
		// iterate through values only
	    System.out.print("\nValues: ");
	        for (String value : map.values()) {
	      System.out.println("map values: "+value);
	        }
	        
	        
	        
			
	     
	    }  
	   
		
		
}


		

