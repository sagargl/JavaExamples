package Naveen;

public class PrintOneToHunderedWithoutNumber {
	public static void main(String[] args) {
		
	
	
	int one='A'/'A';//prints 1
	String s1 = "..........";
	/* First Approach*/
	for(int i=one; i<=(s1.length() * s1.length()); i++)
	{
		System.out.println(i);
	}


	
	/*Second Approach*/
	/* Ascii value for a=97, b=98, c=99*/
	
	for(int i=one; i<'d'; i++)
	{
		System.out.println("Ascii value is"+i);
	}
}
}