import java.util.Scanner;

public class Задача1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter two numbers for length and width of an rectangle.");
		System.out.print("Lenght = ");
		float length = input.nextFloat();   
				
		System.out.print("Width = ");
		float width = input.nextFloat();   
				
		float area = length * width;
	    System.out.println("The area of the rectangle is: " + area);		
	}
}