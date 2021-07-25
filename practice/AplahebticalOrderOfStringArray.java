package practice;

public class AplahebticalOrderOfStringArray {
public static void main(String[] args) {
	

	String s1[]= {"abc","def","aaa","bed"};
	String temp;
	for(int i=0; i<s1.length; i++)
	{
		for(int j=i+1; j<s1.length; j++)
		{
			if(s1[i].compareTo(s1[j])>0)
			{
				temp=s1[i];
				s1[i]=s1[j];
				s1[j]=temp;
			}
			
		}
		
	}
	for(int k=0; k<s1.length; k++)
	{
		System.out.println(s1[k]);
	}
}
}
