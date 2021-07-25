



public class SortTheNumbers {
	public static void main(String[] args) {
		
	
	int numbers[]= {1,5,4,6,8,9,3};
	int temp;
	int n=numbers.length;
	int i;
	for(i=0; i<n; i++)
	{
		for(int j=i+1; j<n; j++)
		{
			if(numbers[i]<numbers[j])
			{
				temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
			}
		}
	}
	
	
	/*Ascending sort*/
	for(i=0; i<n; i++)
	{
		System.out.println("Ascending numbers is"+numbers[i]);
	}
	
	}
	
}
