package lesson4;

public class RecursivePalindrome {
	
	public static boolean isPalindrome(String input)
	{
		
		if(input.length() == 1 || input.length() == 0)
			return true;
		else
		{
			if(input.charAt(0) == input.charAt(input.length()-1))
				return isPalindrome(input.substring(1, input.length()-1));
			else 
				return false;
		}
		
	}

	public static void main(String[] args) {
		
		String str = "mum";
		System.out.println(isPalindrome(str));

	}

}

/*
 * Input:   mum
 * 
 * Output: true
 * 
 * 
 */
