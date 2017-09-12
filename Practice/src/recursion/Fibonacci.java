package recursion;

public class Fibonacci {
	
	public static int Fibonacci(int n)
	{
		if(n == 0 || n == 1)
			return n;
		
		return Fibonacci(n-1)+Fibonacci(n-2);
	}

	public static void main(String[] args) {
		int n = 5, fib = 1;
		int fn1 = 0, fn2 = 1;
		int temp;
		System.out.println(Fibonacci(n));
		
		for(int i = 2; i <= n; i++)
		{
			temp = fn2;			
			fn2 = fn1 + fn2;
			fn1 = temp;
			
			
		}
		
		System.out.println(fn2);

	}

}
