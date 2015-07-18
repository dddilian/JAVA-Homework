import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your score.It should be between 0 and 9:");
		int result = input.nextInt();

		switch (result) {
		case 1:
		case 2:
		case 3:
			result = result * 5;
			System.out.println("Your resault is: " + result);
			break;
		case 4:
		case 5:
		case 6:
			result = result * 10;
			System.out.println("Your resault is: " + result);
			break;
		case 7:
		case 8:
		case 9:
			result = result * 50;
			System.out.println("Your resault is: " + result);
			break;
		default:
			System.out.println("Invalid score");
		}
		input.close();
	}
}