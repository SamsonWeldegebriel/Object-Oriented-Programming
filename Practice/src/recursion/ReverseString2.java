package recursion;

public class ReverseString2 {
	
	String reverse(String str) 
	{
		if(str.length() == 0)
			return str;
		String first = "" + str.charAt(0);
		return reverse(str.substring(1))+first;
	}

	public static void main(String[] args) {

		ReverseString2 rs = new ReverseString2();
		System.out.println(rs.reverse("Hello World"));

	}
}
