import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.print("Enter number one: ");
		int num1 = input.nextInt();

		System.out.print("Enter number two: ");
		int num2 = input.nextInt();
		
		maxNumber(num1,num2);
		input.close();
	}

	public static void maxNumber(int num1, int num2) {
		
		int max = num1;
		if (num2 > num1) {
			max = num2;
		}
		System.out.println("Maximal number: " + max);
	}
}