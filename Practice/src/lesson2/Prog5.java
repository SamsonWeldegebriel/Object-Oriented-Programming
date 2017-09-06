package lesson2;

import lesson2.RandomNumbers;
public class Prog5 {
	
	public static void main(String[] args)
	{ 
		int[][] ranNum = new int[4][4];
		 
		for(int i=0; i<ranNum.length; i++)
		{
			for(int j=0; j<ranNum.length; j++)
			{
				ranNum[i][j] = RandomNumbers.getRandomInt(1, 99);

				if(i%2!=0)
					System.out.print("+");
				else
					System.out.print(" ");
				System.out.print(String.format(" %2d   ", ranNum[i][j]));
				
			
				
			}
			System.out.println("");
			for(int j=0; j<ranNum.length; j++)
			{
			if(i%2!=0)
				System.out.print(" ____  ");
			
			}
			if(i%2!=0)
			{
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
			}
		}
	}

}
