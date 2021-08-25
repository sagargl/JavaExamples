
public class ThirdHighestInNumber {
	public static void main(String[] args) {
		int a[]= {10,30,70,90,50};
		int temp;
		int size=a.length;
		
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0; k<size; k++)
		{
			System.out.println("Ascending numbers is"+a[k]);
			}
		System.out.println("Third largest numbers :"+a[size-3]);
		
	}

}
