
package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MapSortByValues {
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(80,"sagar");
		map.put(70,"arvind");
		map.put(90,"shim");
		map.put(40,"java");
		map.put(60,"test");
		
		System.out.println("Orignial map is :");
		map.forEach((k,v)->System.out.println(k+"\t"+v));
		
		System.out.println("Map based on keys:");
		Set<Entry<Integer,String>> entryset=map.entrySet();
		List<Entry<Integer,String>>list=new ArrayList<>(entryset);
		Collections.sort(list, new Comparator<Entry<Integer,String>>() 
				{

					@Override
					public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
						// TODO Auto-generated method stub
						return o1.getValue().compareTo(o2.getValue());
					}
			
				});
		
		System.out.println("Map sorted  ased on values::");
		list.forEach(s->System.out.println(s.getKey()+"\t:"+s.getValue()));
				
	}

}
