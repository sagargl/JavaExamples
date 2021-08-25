import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfAWordInSentences {
	public static void main(String[] args) {
		String str="Goodbye bye bye world world world";
		Map<String, Integer>map=new HashMap<String, Integer>();
		String[]words=str.split(" ");
		for(String occ: words)
		{
			if(map.containsKey(occ))
			{
				map.put(occ, map.get(occ)+1);
			}
			else
			{
				map.put(occ, 1);
		}
	}
		System.out.println("Inputstring"+map);

}

}