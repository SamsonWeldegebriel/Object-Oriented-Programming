package lesson2;

import java.util.Scanner;
public class Prog4 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String org = sc.nextLine();
		String reverse = "";
		
		for(int i=org.length()-1; i>=0; i--)
			reverse += org.charAt(i);
		
			System.out.println(reverse);
	}

}
