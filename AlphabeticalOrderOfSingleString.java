

public class AlphabeticalOrderOfSingleString {
	public static void main(String[] args) {
		
		/*Alphabetical order of single string
		 * 
		 * 1. Define the string
		 * 2. Convert the string into array
		 * 3. Compare the first charcter to second, second to third, third to fourth and so on
		 * 4. If first is less than second initiate to the dummy(temp) variable and pass the j value to i and it continue till the loop ends
		 * 
		 */
		String s="bengaluru";
		char[]chars=s.toCharArray();
		char temp;
		for(int i=0; i<chars.length; i++)
		{
			for(int j=i+1; j<chars.length; j++)
			{
				if(chars[i]<chars[j])
				{
					temp=chars[i];
					chars[i]=chars[j];
					chars[j]=temp;
							
				}
			}
		}
		System.out.println("Alpahebetical Sorting begins:");
		for(int k=0; k<chars.length; k++)
			System.out.println(chars[k]);
	
	}

}
