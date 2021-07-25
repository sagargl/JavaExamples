import org.testng.annotations.Test;

public class PrintFirstCharctersOfTheSenteces {
	@Test
	public void FirstWord()
	{
		String s="This is my world";
		String s1[]=s.split(" ");
		System.out.println("First word is"+s1[0]);
	}
	
	@Test
	public void LastWord()
	{
		String s="This is my world";
		String s1[]=s.split(" ");
		System.out.println("Last Word is"+s1[s1.length-1]);
	}

	@Test
	public void FirstCharcter()
	{
		String s="This is my world";
		String s1[]=s.split("\\s+");
		System.out.println("First charcter"+s.charAt(0));
		/*First charcter for each words is*/
		for(int i=0; i<s1.length; i++)
		{
			
			String word=s1[i];
			System.out.println("First charcter of each word is"+word.charAt(0));
		}
	}
	
	@Test
	public void LastCharcterOfFirstWord()
	{
		String s="This is my world";
		String s1[]=s.split("\\s+");
		System.out.println("Last charcter of first word is :"+s.charAt(s1.length-1));
		
	}
	@Test
	public void LastCharcterOfEveryWord()
	{
		String s="This is my world";
		String s1[]=s.split("\\s+");
		
		for(int i=0; i<s1.length; i++)
		{
			String word=s1[i];
			System.out.println("Last charcter of every word is :"+word.charAt(word.length()-1));
			
		}
		
	}
	
	@Test
	public void LastCharcterofEntireSentence()
	{
		String s="This is my world";
		System.out.println("Last charcter of entire sentence is :"+s.charAt(s.length()-1));

	}
}
