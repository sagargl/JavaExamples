


public class MovingAllZeroesToEnd {
	public static void main(String[] args) {
		int [] arr= {10,0,20,30,40,50,0};
		int count=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				System.out.println("string values "+arr[count++]);
			}
		}
		
		while(count<arr.length)
		{
			arr[count++]=0;
			System.out.println("After"+arr[count++]);
		}
		System.out.println("Moving zeroes tos end");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
	}

}
