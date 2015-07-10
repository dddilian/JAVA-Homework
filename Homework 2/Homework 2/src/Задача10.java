import java.util.Scanner;

public class Задача10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number for side a = ");
		int a = input.nextInt();
		
		System.out.print("Enter a number for height = ");
		int h = input.nextInt();
		
		int area = (a * h)/2;
		System.out.println("The area of the triangle is: " + area);
	}
}