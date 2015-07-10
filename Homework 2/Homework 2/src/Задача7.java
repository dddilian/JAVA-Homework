import java.util.Scanner;

public class Задача7 {   //число, което се дели едновременно на 5 и 7

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = input.nextInt();                                  // проверка с х = 35
		
		boolean withoutRemainder = (x % 5 == 0) && (x % 7 == 0);
		
		System.out.println("The number could be divided by 5 and 7 without remainder?" );
		System.out.println(withoutRemainder);
	}
}