//Ќапишете програма, ко€то да провер€ва дали пети€ бит на дадено число е нула или едно.

import java.util.Scanner;

public class HomeTask2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to see its binary representation: ");
		int x = sc.nextInt();
		
		long result = 0;
		long tens = 1;
		
		while(x > 0) {
			int bit = x % 2;
			System.out.println(bit);
			
			x = x/2;
			
			result = result + bit*tens; //за да изкараме в правилната посока бинарни€ запис
			
			System.out.println("Let`s see the current bit in tens:" + (bit*tens));
			
			tens = tens*10;  //10 на степен, равна на бро€ интерации на цикъла
		}
		System.out.println("Result = " + result);
		sc.close();
	}
}

