package Encapsulation;

public class ReverseOfString {
	public static void main(String[] args) {
		String str="TeseT";
		String rev="";
	
		int s1=str.length();//Prints the length of string
		int s2=str.length()-1;//Prints the length of string -1;
	
for(int i=str.length()-1; i>=0; i--)
{
	rev=rev+str.charAt(i);
}
System.out.println(rev);

if(rev.equalsIgnoreCase(str)){
	System.out.println("String is palindrome");
}
else
{
	System.out.println("String is not palindorome");
}
}
}
