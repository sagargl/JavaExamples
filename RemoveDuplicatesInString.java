

public class RemoveDuplicatesInString {
	public static void main(String[] args) {
		/* 
		 * 
		 * Define the string s
		 * Define the dummy string s2
		 * Define the Boolean value as false
		 * Enter the loop for s
		 * Enter the loop for s2
		 * If both character is equal b/w s and s2 and it found true break
		 * Else it will start concatenating the character to s2 string
		 */
		String s="navneet";
		String s2="";
		Boolean found=false;
		for(int i=0; i<s.length(); i++)
		{
			for(int j=0; j<s2.length(); j++)
			{
				if(s.charAt(i)==s2.charAt(j))
				{
				found=true;
				break;
			}
		}
			


	}
System.out.println("After Removing duplicate string :"+s2);
	}
}
