package lesson2;

public class RemoveDups {
	
	public static void main(String[] args){
		
		String[] input = {"horse", "dog", "cat", "horse","dog"};
		String[] temp = input;// new String[input.length]; 
		int index = 0;
		String[] output = new String[input.length];
		
		boolean unique = true;
		
		//output[0] = input[0];
		//= new String[input.length];
				
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
		
		
		
		for(int i=0; i < output.length; i++)
		{
			System.out.println(output[i]);
		}
	
		
		
	}

}
