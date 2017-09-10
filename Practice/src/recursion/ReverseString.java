package recursion;

public class ReverseString {

	StringBuilder ret = new StringBuilder();
	public String reverseString(String str)
	{
		if(str.isEmpty())
		{
			return ret.toString();
		}
		
		ret.append(str.charAt(str.length()-1));
		reverseString(str.substring(0, str.length()-1));
		return ret.toString();
	}
	public static void main(String[] args) {

		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseString("Hello World"));

	}

}
