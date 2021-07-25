import java.util.Arrays;

public class ArrayEqualsOrNot {
	public static void main(String[] args) {
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {10,30,40,50,60};
		System.out.println("Arrays are equal or not"+Arrays.equals(arr1, arr2));
	
/*without built in functions*/
	for(int i=0; i<arr1.length; i++)
	{
		for(int j=0; j<arr2.length; j++)
		{
			if(arr1[i]==arr2[j])
			{
				//System.out.println("arrays are equals");
			}
			}
	}
	System.out.println("arrays equal");
	
	}
}
