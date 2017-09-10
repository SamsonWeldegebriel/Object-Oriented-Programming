package recursion;

public class MinimumChar {
	
	
	public static Character findMin(String s)
	{
		
		if(s.isEmpty() || s == null)
		{
			return null;
		}
		
		char min = s.charAt(0);
		if(s.length() == 1) return min;
		
		char c = findMin(s.substring(1));
				
		return (min < c ? min: c);
		
	}
	
	public static Character rmin(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		char ch = str.charAt(0);
		if (str.length() == 1)
			return ch;
		char c = rmin(str.substring(1));
		return (ch < c ? ch : c);
	}

	public static void main(String[] args) {


		System.out.println(findMin("hello"));
		System.out.println(rmin("hello"));
		
		

	}

}
