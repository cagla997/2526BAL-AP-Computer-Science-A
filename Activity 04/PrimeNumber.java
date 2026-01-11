package asalsayi;

import java.util.Scanner;

public class AsalSayi {
	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		System.out.print("Lower Bound:");
		int s1; 
		s1 = oku.nextInt();
		
		System.out.print("Upper Bound:");
		int s2;
		s2 = oku.nextInt();
		
		System.out.println("Prime number in the Inclusive Range [" + s1 + "," + s2 + "]");
		System.out.println("-----------------------------------------");
		
		
		
		for (int num = s1; num <= s2; num++) { 
			boolean asal = true;
			if (num <= 1) {
				asal = false;
			}
			else
				for (int i = 2; i < num; i++) { 
					if (num % i == 0) {
						asal = false;
					}
					
				}
			
			if (asal) {
				System.out.print(num + " ");
			}
			
			
		}
		
	}

}
