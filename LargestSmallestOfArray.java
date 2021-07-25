
public class LargestSmallestOfArray {
	public static void main(String[] args) {
		
		/*
		 * 1. Initilize the array
		 * 2. Initilize the big and small array 
		 * 3. Enter the loop and if it is greater than num1[0] it will accept the big else small
		 * 
		 */
		int num1[]= {3,10,5,7,9};
		int big=num1[0];
		int small=num1[0];
		
		for(int i=0; i<num1.length; i++)
		{
			if(num1[i]> big)
			{
				big=num1[i];
			}
			else if(num1[i] < small)
			{
				small=num1[i];
			}
				}
		
		System.out.println(big);
		System.out.println(small);

	}

}
