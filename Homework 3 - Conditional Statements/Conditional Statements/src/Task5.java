import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a symbol, that represents a valid card:");

		String symbol = input.nextLine();
		symbol = symbol.toUpperCase();

		switch (symbol) {
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "Q":
		case "K":
		case "A":
			System.out.println("You have entered a valid card.");
			break;

		default:
			System.out.println("There is no such card!");

		}
		input.close();
	}
}