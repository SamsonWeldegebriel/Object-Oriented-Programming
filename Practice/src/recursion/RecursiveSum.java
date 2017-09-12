package recursion;

public class RecursiveSum {
	
	public static int Sum(int n) {
		if (n == 1) // base case
			return 1;
		else
			return n + Sum(n - 1); // general case
	}

	public static void main(String[] args) {

		System.out.println(Sum(5));

	}

}
