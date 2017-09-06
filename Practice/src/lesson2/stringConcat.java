package lesson2;

public class stringConcat {
	
	public static void main(String[] args){
		String output = "";
		for(String s: args)
		{
			output += s + " ";
		}
		output +=".";
		System.out.println(output);
	}

}
