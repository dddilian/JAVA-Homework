import java.util.Scanner;

public class TaskFromClass3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int result = 0;        // въвеждаме си брояч, където да трупаме въведените числа, т.е. да се събират и да се съхранява сумата им.

		for (;;) {             // безкраен for цикъл

			System.out.println("Enter a number: ");
			int number = input.nextInt();

			if (number == 0) {
				break;
			}

			result = result + number;
		}
		
		System.out.println("The result is: " + result);

		input.close();
	}
}