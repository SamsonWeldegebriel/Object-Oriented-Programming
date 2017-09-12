package recursion;

public class MergeStringsSB {

	StringBuilder ret = new StringBuilder();
	public String merge(String s1, String s2)
	{
		if(s1.isEmpty() && s2.isEmpty())
			return ret.toString();
		
		if(s1.isEmpty())
		{
			ret.append(s2);
			return ret.toString();
		}
		
		if(s2.isEmpty())
		{
			ret = ret.append(s1);
			return ret.toString();
		}
		
		if(s1.charAt(0) < s2.charAt(0))
		{
			ret.append(s1.charAt(0));
			return merge(s1.substring(1), s2);
		}
		else
		{
			ret.append(s2.charAt(0));
			return merge(s1, s2.substring(1));
		}
			
		
	}
	
	public static void main(String[] args)
	{
		MergeStringsSB ms = new MergeStringsSB();
		
		System.out.println(ms.merge("ace", "bdf"));
		
	}
}
