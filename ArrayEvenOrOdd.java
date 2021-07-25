
public class ArrayEvenOrOdd {
public static void main(String[] args) {
	int a[]= {10,3,7,40,};
	System.out.println("Even numberrs are");
	for(int i=0; i<a.length; i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
	
	System.out.println("Odd numbers are");
	for(int j=0; j<a.length; j++)
	{
		if(a[j]%2!=0)
		{
			System.out.println(a[j]);
		}
	}
}
}
