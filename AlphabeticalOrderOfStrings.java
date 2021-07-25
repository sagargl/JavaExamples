

public class AlphabeticalOrderOfStrings {
	
	public static void main(String[] args) {
		
		/* Alphabetical order of strings
		 * 
		 * 1. Define the String array
		 * 2. Length of the string array
		 * 3. Commpares the first string to next string
		 * 4. If it less than 0-prints ascending order
		 * 5. If it's greater than 0-Prints descending order
		 */
		
		String name[]= {"madras","delhi","hyderabad","mumbai","bengaluru"};
		int size=name.length;
		int i, j;
		String temp=null;
		String temp1="";
		for(i=0; i<name.length; i++)
		{
			for(j=i+1; j<name.length; j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		
		for(i=0; i<name.length; i++)
		{
			System.out.println("Alpahabetoical strings is:"+name[i]);
		}
		
	}

}
