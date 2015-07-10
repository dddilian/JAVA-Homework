import java.util.Scanner;

public class Задача8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = input.nextInt();                                  

		boolean evenOdd = (x % 2 == 0);

		System.out.println("The number is even?" );
		System.out.println(evenOdd);	
	}
}