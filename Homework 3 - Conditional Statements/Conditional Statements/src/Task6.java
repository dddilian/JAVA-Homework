import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter coeficient \"a\"");
		double a = input.nextDouble();

		System.out.println("Please enter coeficient \"b\"");
		double b = input.nextDouble();

		System.out.println("Please enter coeficient \"c\"");
		double c = input.nextDouble();

		double discriminant = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		System.out.println("Discriminant is: " + discriminant);

		double root0;
		double root1;
		double root2;

		if (discriminant == 0) {
			System.out.println("There is only one double real root");
			root0 = -b / (2 * a);
			System.out.println("The double root is: " + root0);

		} else if (discriminant > 0) {
			root1 = (-b + discriminant) / (2 * a);
			root2 = (-b - discriminant) / (2 * a);
			System.out.println("Real root 1: " + root1);
			System.out.println("Real root 2: " + root2);

		} else {
			System.out.println("It appears that the discriminant is negative number, so there are no real roots.");
		}
		input.close();
	}

}