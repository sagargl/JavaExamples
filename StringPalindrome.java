

public class StringPalindrome {
public static void main(String[] args) {
	String s="mffsadam";
	String rev="";
	
	for(int i=s.length()-1; i>=0; i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	
	if(rev.equalsIgnoreCase(s))
	{
		System.out.println("String is palindrome");
	}
	else {
		System.out.println("String is not palindrome");
	}
}
}
