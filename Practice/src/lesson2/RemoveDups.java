package lesson2;

import java.util.Arrays;

public class RemoveDups {
	
	public static void main(String[] args){
		
		String[] input = {"horse","dog", "cat", "horse","dog"};
		String[] temp = input;
		int index = 0;
		String[] output = new String[input.length];
		
		boolean unique = true;
		
				
		for(int i=0; i< input.length; i++)
		{
			for(int j = 0; j < output.length; j++)
			{
				if(input[i] == output[j])
				{
					unique = false;
					break;
				}
				else
					unique = true;
				
					
			}
			
			
			if(unique)
			{	
				temp = output;
				output = new String[index+1];
				System.arraycopy(temp, 0, output, 0, index);
				output[index] = input[i];
				index++;
			}
			
		}
		
		System.out.print(Arrays.toString(output));
	}
}

/*
 * 
 * Output: [horse, dog, cat]
 * 
 */
