
public class MissingNumberInAnArray {
public static void main(String[] args) {
	/*
	 * 
	 * int a[]={1,2,4};
	 * 1+2+3+4=10
	 * 1+2+3=6
	 * 10-6=4
	 */
	int arr[]= {1,2,3,5,6,7};
	int n=arr.length+1;
	int sum=n*(n+1)/2;
	System.out.println(sum);
	
	int restSum=0;
	for(int i=0; i<arr.length; i++)
	{
		restSum+=arr[i];
		//System.out.println(restSum);
	}
	//
	System.out.println(restSum);

	int missingNumber=sum-restSum;
	System.out.println(missingNumber);
}
}
