



public class ReverseEachWordOfAString {
public static void main(String[] args) {
	/*
	 * First it will split the string
	 * Then it will loop the splitted string like-java, beginners, book
	 * After that it will reenter the loop for reverse the string
	 */
	String str="java beginners book";
	String[] words=str.split(" ");
	String reversestring=" ";
	for(int i=0; i<words.length; i++)
	{
		String word=words[i];
		String reverseword="";
		for(int j=word.length()-1; j>=0; j--)
		{
			reverseword=reverseword+word.charAt(j);
		}
		reversestring=reversestring+reverseword+"";
		
	}
	System.out.println(str);
	System.out.println(reversestring);
	
	
}
}
