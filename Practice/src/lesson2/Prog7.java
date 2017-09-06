package lesson2;

public class Prog7 {
	public static void main(String[] args)
	{
		int counStartsWithA = 0;
		
		for(int i=0; i<args.length;i++)
		{
			System.out.println("Length of \"" + args[i] +  "\" : " + args[i].length());
		}
		for(int i=0; i<args.length;i++)
		{
			if(args[i].startsWith("A"))
			{
				counStartsWithA++;
			}
		}
		
		System.out.println("The Number of inputs that starts with A: " + counStartsWithA);
	}
}

/*
 * Input: Create An Array Which Accepts An Array Of Strings Only
 * Output: 
 * 
Length of "Input" : 5
Length of "Create" : 6
Length of "An" : 2
Length of "Array" : 5
Length of "Which" : 5
Length of "Accepts" : 7
Length of "An" : 2
Length of "Array" : 5
Length of "Of" : 2
Length of "Strings" : 7
Length of "Only." : 5
The Number of inputs that starts with A: 5
 *
 * */
