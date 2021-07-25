package Exception;

public class ExceptionHandling {
public static void main(String[] args) {
	int a=10;
	a=10/0;	
	int ar[] = {1, 2, 3, 4, 5};
    for (int i=0; i<=ar.length; i++)
      System.out.println(ar[i]);
    
	try {
	System.out.println("Try block");	
	}
//	catch(Exception e3)
//	{
//		System.out.println("Exception is"+e3);
//	}
	catch(ArithmeticException e1)
	{
		System.out.println("Arthimatic"+e1);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("exception is"+e);
	}
	
}
}
