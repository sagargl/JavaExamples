
public class RoundingOfDigits {
public static void main(String[] args) {
	
	int  number=94;
	int rem=number%10;
	
	if(rem<5)
	{
		number=number+(10-rem);
	}
	else
	{
		number=number-rem;
	}
	System.out.println("Result is"+number);
}
}
