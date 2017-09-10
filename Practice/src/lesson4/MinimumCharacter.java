/**
 * 
 */
package lesson4;

/**
 * @author Samson Mebrahtu Weldegebriel
 *
 */
public class MinimumCharacter {

	
	public static String minimumCharacter(String input, String minChar)
	{
		if(input.length()  < 1)
		{
			return minChar;
		}
		else
		{
			if(minChar.charAt(0)>input.charAt(0))
				minChar = input.substring(0, 1);
			return  minimumCharacter(input.substring(1), minChar);
		}
		
		//return '0';
	}
	public static void main(String[] args) {
		
		String input = "performance";
		
		System.out.println("Minimum Character: " + minimumCharacter(input, input.substring(0, 1)));

	}

}

/*
 * Input: performance
 * Output: Minimum Character: a
 */
