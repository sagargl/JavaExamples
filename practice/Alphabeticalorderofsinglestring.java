package practice;

public class Alphabeticalorderofsinglestring {
	public static void main(String[] args) {
		String s="navneet";
		char temp;
		char[]s1= s.toCharArray();
		
		for(int i=0; i<s1.length; i++)
		{
			for(int j=i+1; j<s1.length; j++)
			{
				if(s1[i]<s1[j])
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
