import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int hundreds = number / 100;
		int tens = (number / 10) % 10;
		int ones = (number % 100)%10;

		System.out.println("Hundreds: " + hundreds);
		System.out.println("Tens: " + tens);
		System.out.println("Ones: " + ones);
		
		sc.close();
	}
}