/**
 * 
 */
package lesson4;

/**
 * @author Samson Mebrahtu Weldegebriel
 *
 */
public class MinimumCharacter {

	
	public static Character minimumCharacter(String input)
	{
		if(input.length() == 0 || input == null )
		{
			return null;
		}
		else
		{
			char minChar = input.charAt(0);
			if(input.length() == 1) return minChar;
			
			char c = minimumCharacter(input.substring(1));
			return (minChar < c ? minChar: c);
		}
		
		//return '0';
	}
	public static void main(String[] args) {
		
		String input = "performance";		
		System.out.println("Minimum Character: " + minimumCharacter(input));

	}

}

/*
 * Input: performance
 * Output: Minimum Character: a
 */
