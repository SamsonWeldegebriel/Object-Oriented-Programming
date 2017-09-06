package lesson2;

import lesson2.RandomNumbers;

public class Prog1 {
	
	public static void main(String[] args) {
		
		int x = RandomNumbers.getRandomInt(1, 9);
		int y = RandomNumbers.getRandomInt(3, 14);
		
		System.out.println(Math.pow(Math.PI, x));
		System.out.println(Math.pow(y, Math.PI));
		
	}

}

/*
 * Out put: 961.3891935753043
 *			156.99254530886589
 *
 */
