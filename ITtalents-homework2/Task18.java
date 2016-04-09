import java.util.Scanner;

//Да се състави програма, чрез която се въвежда две числа от
//интервала [1..9].
//Програмата да извежда таблицата за умножение.
//Максималната стойност на множителите е определена от 2-те
//числа

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers between 1 and 9: ");
		
		System.out.println("Enter number1: ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter number2: ");
		int number2 = sc.nextInt();

		while ((number1 < 1 || number1 > 9) || (number2 < 1 || number2 > 9)) {

			System.out.println("Out of range. Enter again: ");
			System.out.println("Number1: ");
			number1 = sc.nextInt();
			System.out.println("Number2: ");
			number1 = sc.nextInt();
		}
		
		for (int i = 1; i <= number1; i++) {
			for (int j = 1; j <= number2; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		sc.close();
	}
}
