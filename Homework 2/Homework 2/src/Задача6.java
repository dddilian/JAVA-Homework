import java.util.Scanner;

public class Задача6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for radius: "); 
		double r = input.nextDouble();
		
		double surface = Math.PI * r * r;    
		
		double perimeter = 2 * Math.PI * r; 
		
		
		System.out.println("The surface is: " + surface); 
		System.out.println("The perimeter is: " + perimeter);
	}
}