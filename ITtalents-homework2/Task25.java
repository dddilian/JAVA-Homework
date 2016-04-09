//Да се направи програма, която по дадено число N, да изчислява N!, т.е. 1*2*3*4...*N.
//Използвайте цикъл do-while.

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = sc.nextInt();

		long factorialN = 1;

		do {
			factorialN = factorialN * n;
			n--;
			
		} while (n >= 1);
		
		System.out.println("N! is: " + factorialN);
		sc.close();
	}
}
