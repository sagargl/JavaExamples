
public class FibonacciSeries {
	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3;
		int num=10;
		
		System.out.println("Fibonacci series are");
		for(int i=0; i<num; i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3
					;
			System.out.println(fib3);
		}
	}

}
