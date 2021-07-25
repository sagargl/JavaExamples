package Loops;

public class For {
	public static void main(String[] args) {
		
	/*Normal Loop*/
	int a[]= {10,20,30,40,50};
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
		
	
	
	/* For Enhance loop*/
	for(int num: a)
	{
		System.out.println(num);
	}
	
	}
}
