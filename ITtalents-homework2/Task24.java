//Едно число X е палиндром, aко се чете еднакво отпред назад и отзад напред.
//Да се състави програма, която проверява дали въведено число е палиндром.
//Входни данни: N - естествено число от интервала [10 .. 30000].
//Пример: 17571
//Изход: числото е палиндром
//Използвайте цикъл do-while.

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 30 000");
		int n;

		do { 
			n = sc.nextInt();

			if (n < 10 || n > 30000) {
				System.out.println("Not in the desired interval, try again: ");
			}

		} while (n < 10 || n > 30000);
		System.out.println("You have entered " + n);

		
	       int M = n;
	       int rev = 0,rmd;   //reversing number
	       
	       while(n > 0) 
	       { 
	         rmd = n % 10; 
	         rev = rev * 10 + rmd; 
	         n = n / 10; 
	       } 
	       if(rev == M) 
	         System.out.println("Palindrome Number!"); 
	       else
	         System.out.println("Not a Palindrome Number!"); 
	       sc.close();
	     } 
	}