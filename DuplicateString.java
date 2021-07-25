
public class DuplicateString {
	public static void main(String[] args) {
		
		/* To Get the Duplicate string we need to perform the following steps:
		 * 
		 * 1. Define the string
		 * 2. Convert the string to array
		 * 3. Compare the one string to next string using for loop
		 * 4. Print the duplicate string
		 */
		String s="navneet";
		//Converts string into array
		char[]sarray=s.toCharArray();
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(sarray[i]==sarray[j])
				{
					System.out.println(sarray[i]);
				}
			}
		}
	}

}
