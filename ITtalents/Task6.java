//Write a program that reads a short positive number and tells how many bits are 1 in it.
//Програма показваща колко от битовете в това число са 1ца. В случая с 13 са 3.

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter positive number: ");
		int x = sc.nextInt();
		
		int count = 0;
		
		while(x > 0) {
			if((x&1) == 1) {         //ако битчето на дадената позиция е 1ца, увелчи брояча.
				count++;
			}
			x = x/2;
		}
		
		System.out.println("The bits, that are 1 are: " + count);
		sc.close();
	}
}
 