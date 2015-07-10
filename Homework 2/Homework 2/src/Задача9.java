import java.util.Scanner;

public class Задача9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		
		System.out.print("a = ");
		int a = input.nextInt();
		
		System.out.print("b = ");
		int b = input.nextInt();
		
		int remainder = a % b;
		System.out.println("The remainder of their division is: " + remainder);
	}
}