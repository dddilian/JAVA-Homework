import java.util.Scanner;

public class fibonacciRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to see what fibonnaci number represents");

		int x = sc.nextInt();

		int result = fibRec(x);
		System.out.println("Fibonaci with recursion: " + result);

		int result2 = fibRegular(x);
		System.out.println("Fibonaci with interative(loop): " + result2);

		int result3 = fibArray(x);
		System.out.println("Fibonaci with array: " + result3);

		sc.close();
	}

	static int fibRec(int n) { // рекурсивен метод за изчисление на n-тото число
							   // на Фибоначи
		if (n <= 2) {
			return 1;
		} 
		return fibRec(n - 2) + fibRec(n - 1);
			
	}
	
	static int fibRegular(int n) { // метод за фибоначи с цикъл итеративно
		int first = 1;
		int second = 1;
		int next = first + second;

		for (int i = 3; i < n; i++) {
			first = second;
			second = next;
			next = first + second;
		}
		return next;
	}

	static int fibArray(int n) { // метод за фибоначи с масив

		int[] array = new int[n]; // приема дължина на масива
		array[0] = 1;
		array[1] = 1;

		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];

		}
		return array[array.length - 1]; // length-1, за да върне последното
										// число, намиращо се на последния
										// индекс
	}
}
