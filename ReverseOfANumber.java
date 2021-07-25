
public class ReverseOfANumber {
	public static void main(String[] args) {
		int number=1678;
		int rev=0;
		int rem=0;
		int temp=number;
		

		while(number>0)
		{
			//Prints the Percentage-i.e,1678%10=8, 167%10=7, 16%10=6, 1%10=1
			rem=number%10;
			//Store the one by one percentage value to the reverse string
			rev=rev*10+rem;
			//Divides the number/10 and it will excludes the reminder value i.e, 1678/10=167, 167/10=16, 16/10=6, 1/10=1 
			number=number/10;
		}
		
		System.out.print("Reverse of a number is:" +rev);

	}

}
