

public class SortTheSingleString {
public static void main(String[] args) {
	String s="navneet";
	char[]c=s.toCharArray();
	char temp;
	
	for(int i=0; i<c.length; i++)
	{
		for(int j=i+1; j<c.length; j++)
		{
			if(c[i]<c[j])
			{
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				
			}
		}
	}
	
	for(int i=0; i<c.length; i++)
	{
		System.out.println(c[i]);
	}
}
}
