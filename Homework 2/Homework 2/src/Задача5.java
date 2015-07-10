import java.util.Scanner;

public class Задача5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Ënter four numbers: ");
		
		System.out.print("a = ");
		int a = input.nextInt();
		
		System.out.print("b = ");
		int b = input.nextInt();
		
		System.out.print("c = ");
		int c = input.nextInt();
		
		System.out.print("d = ");
		int d = input.nextInt();
		
		int sum = a + b + c + d;
		System.out.println("The sum of all four numbers is: " + sum);
	}
}