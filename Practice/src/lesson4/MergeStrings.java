package lesson4;

public class MergeStrings {
	
	
	public static String mergeStrings (String s1, String s2)
	{
		return privateMergeStrings(s1, s2, "");
	}
	private static String privateMergeStrings(String s1, String s2, String Output)
	{
		
		if((s1.equals("") || s1 ==null) &&  (s2.equals("") || s1 == null))
		{
			return "";
		}
		else if((s1==null) || s1.equals(""))
		{
			return Output+s2;
		}
		
		else if(s2.equals(null) || s2.equals(""))
		{
			return Output+s1;
		}
		
		else
		{
			if(s1.charAt(0) <= s2.charAt(0))
			{
				Output += s1.charAt(0);
				s1 = s1.substring(1);
			}
			else
			{
				Output += s2.charAt(0);
				s2 = s2.substring(1);
			}	
			return privateMergeStrings(s1, s2, Output);
		}
	}
	 
	public static void main(String[] args)
	{
		String String1 = "ace";
		String String2 = "bdf";
		
		
		System.out.println("The merged String is: "+mergeStrings(String1, String2));
	}
}

/* 
 * 
 * input => String1 = "ace", String2 = "bdf";
 * 
 * output => The merged String is: abcdef
*/