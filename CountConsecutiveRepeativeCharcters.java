

public class CountConsecutiveRepeativeCharcters {
public static void main(String[] args) {
	String s="aaabbca";
		for(int i=0; i<s.length(); i++)
	{
		int count=1;
		while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
		{
			count++;
			i++;
		}
		System.out.print(s.charAt(i)+""+count);
		//System.out.println("");
		
}
		
}
}