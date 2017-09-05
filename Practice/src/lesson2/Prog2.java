package lesson2;

public class Prog2 {
	
	public static void main(String[] args)
	{
		float x, y, z;
		int sumCasting, sumRound;
		x = 1.27f;
		y = 3.881f;
		z = 9.6f;
		
		sumCasting = (int) (x + y + z);
		sumRound = Math.round(x + y + z);
		
		System.out.println(sumCasting);
		System.out.println(sumRound);
		
	}

}
