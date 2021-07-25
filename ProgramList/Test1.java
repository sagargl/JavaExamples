package ProgramList;

public class Test1 {
	public static void main(String[] args) {
		
	
	String s="teset";
	int size=s.length();
	String rev="";
	for(int i=s.length()-1; i>=0; i--)
	{
		rev=rev+s.charAt(i);
		System.out.println(rev);
	}
if(rev.equalsIgnoreCase(s))
{
	System.out.println("palindrome");
}
	else
	{
		System.out.println("not palindrome");	
	}
}
}
