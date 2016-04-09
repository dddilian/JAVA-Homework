import java.util.Scanner;

//Да се състави програма, която извежда първите 10 най-малки
//числа, които се делят на 2, 3 или на 5 и които са по-големи от
//въведено естествено число.
//Числата се извеждат, заедно с техния пореден номер.
//Входни данни: число от интервала [1..999]
//Пример: 1
//Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
//Използвайте цикъл while.

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value between 1 and 999: ");
		int x = sc.nextInt();

		while (x < 1 || x > 999) {

			System.out.println("Out of range. Enter again: ");
			x = sc.nextInt();
		}

		int counter = 0;

		while (counter < 10) {
			if (x % 2 == 0 || x % 3 == 0 || x % 5 == 0) {
				counter++;
				System.out.print(counter + ":" + x + "; ");
			}
			x++;
		}
		sc.close();
	}
}