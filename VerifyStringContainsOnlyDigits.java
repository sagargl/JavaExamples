
public class VerifyStringContainsOnlyDigits {
	
	public static boolean isEmpty(CharSequence cs)
	{
		return cs==null || cs.length()==0;
	}
	
	public static boolean isNumeric(CharSequence cs)
	{
		if(isEmpty(cs))
		{
			return false;
		}
		int len =cs.length();
		for(int i=0; i<len; i++)
		{
			if(!Character.isDigit(cs.charAt(i)))
			{
				return false;

			}
		}
		return true;
	}
	public static void main(String[] args) {
		/* Null is not an Numeric number*/
		System.out.println(isNumeric(null));
		/* Blank is not an Numeric number*/
		System.out.println(isNumeric(""));
		/* Empty is not an Numeric number*/
		System.out.println(isNumeric(" "));
		/* Charcter A is not an Numeric number*/
		System.out.println(isNumeric("a"));
		/* Numeric 1 is  a Numeric number*/
		System.out.println(isNumeric("1"));
		/* Numeric 123 is a Numeric number*/
		System.out.println(isNumeric("12345"));
		/* testing is not an Numeric number*/
		System.out.println(isNumeric("testing"));
		/* Alphanumeric is not an Numeric number*/
		System.out.println(isNumeric("test123"));
		
		
		
		
		
		
	}

}
