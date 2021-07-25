import org.testng.annotations.Test;

public class CapitlizeOfStrings {
	@Test
	public void CapitilizeFirstWord()
	{
		String s="this is my world";
		String s1[]=s.split(" ");
		System.out.println("Fist word is:"+s1[0]);
		System.out.println("Capitlize of first word"+s1[0].toUpperCase());
	}
	
	@Test
	public void CapitilizeLastWord()
	{
		String s="this is my world";
		String s1[]=s.split(" ");
		System.out.println("First word is:"+s1[s1.length-1]);
		System.out.println("Capitlize of last word"+s1[s1.length-1].toUpperCase());
	}

	@Test
	public void CapitilizeFirstCharacter()
	{
		String s="this is my world";
		String s1[]=s.split("\\s+");
		System.out.println("Fist charcter is:"+s.charAt(0));
		System.out.println("Capitlize of first charcter"+s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase());
	}
	
	@Test
	public void CapitilizeLastCharacter()
	{
		String s="this is my world";
		String s1[]=s.split("\\s+");
		System.out.println("Last charcter is:"+s.charAt(0));
		String first = s.substring(0, 1).toLowerCase();
		String last = s.substring((s.length() - 1), s.length()).toUpperCase();
		String middle = s.substring(1, s.length() - 1);
		
		System.out.println("First is:"+first);
		System.out.println("last is"+last);
		System.out.println("Middle is"+middle);
		System.out.println("Capitlize last"+middle+last);
		}
	
	@Test
	public void CapitalizeEveryFirstWord()
	{
		String s="thTis is my world";
		String s1[]=s.split("\\s+");
		/*First charcter for each words is*/
		int i;
		String first="";
		String last="";
		String word="";
				for(i=0; i<s1.length; i++)
		{
			
			 word=s1[i];
			 first=word.substring(0,1).toUpperCase();
			 last=word.substring(1).toLowerCase();
			 String entire=first+last;
			System.out.println("First charcter of each word is"+entire);
			
			for(int j=0; j<entire.length(); j++)
			{
				//System.out.println("Whole is"+entire[j]);
			}
		}
			
	}

}

//
//String s="This is my world";
//String s1[]=s.split("\\s+");
//System.out.println("First charcter"+s.charAt(0));
///*First charcter for each words is*/
//for(int i=0; i<s1.length; i++)
//{
//	
//	String word=s1[i];
//	System.out.println("First charcter of each word is"+word.charAt(0));
//}