import java.util.Scanner;

public class nFactoriel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value to show !value: ");
		int x = sc.nextInt();
		
		
		System.out.println(factoriel(x));  //викаме метода за факториел, като му подаваме int x
		sc.close();
	}

	static int factoriel(int n) { // РЕКУРСИВЕН метод за изчисление на факториел
		if (n == 0) { //или (n < 1)
			return 1;
		}
		
		return n * factoriel(n - 1);  // n! = n*(n-1)!

	}
}
