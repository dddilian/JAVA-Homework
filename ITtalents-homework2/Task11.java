//Въведете число N чрез конзолата и изкарайте като
//резултат следния триъгълник с височина N:

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for height of the triangle: ");
		int height = sc.nextInt();
		
		for (int i = 1; i <= height; i++) { 
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= height - i; j++) {  
					System.out.print(" ");
				}
				for (int k = 1; k <= 2 * i - 1; k++) {  
					if (i == 1 || i == height || k == 1 || k == i*2-1) {  // k == i*2-1 външна страна 
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		sc.close();
	}
}