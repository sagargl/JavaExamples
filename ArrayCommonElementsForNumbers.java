
public class ArrayCommonElementsForNumbers {
	public static void main(String[] args) {
		
		/*Compares the two arrays and gives the condition if array1[i]==array2[j].
		 * If both are equal print the common value
		 */
		int a[]= {10,20,30,50,90,40};
		int b[]= {70,60,20,50,40};
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
