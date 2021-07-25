
public class RemoveOccurencesInSentence {
	public static void main(String[] args) {
		
	
	String str="Goodbye bye bye world world world";
	String[]words=str.split(" ");
	String firstword= words[0];
	int size=words.length;
	String word="";
	int i;
	for(i=0; i<words.length; i++)
		
	{
		 word=words[i];
		if(firstword.equalsIgnoreCase(words[i])==true)
		{
			System.out.println(words[i]);
			
		}
		
	}
	
	}
}
	
	