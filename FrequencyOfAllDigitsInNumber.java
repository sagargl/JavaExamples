import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfAllDigitsInNumber {
	
	public static void getDigitCount(long number)
	{
		HashMap<Long, Integer>digitMap=new HashMap<Long, Integer>();
		while(number!=0)
		{
			long lastDigit=number %10;
			if(digitMap.containsKey(lastDigit))
			{
				digitMap.put(lastDigit, digitMap.get(lastDigit)+1);
			}
			else
			{
				digitMap.put(lastDigit, 1);
			}
			number=number/10;
		}
		/*** For Keyset*****/
		Set<Long> keys=digitMap.keySet();
		for(Long key : keys)
		{
			System.out.println(" " + key + " " +digitMap.get(key));
		}
		
		/**** For EntrySet****/
		Set<Entry<Long, Integer>> keys1=digitMap.entrySet();
		for(Entry<Long, Integer> entry: keys1)
		{
			System.out.println("values is"+entry);
		}
	}
	public static void main(String[] args) {
		
		getDigitCount(121);
	}

}
