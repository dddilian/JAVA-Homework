import java.util.Arrays;
import java.util.Scanner;

public class arrayRecursive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // дължина на масива

		int[] array = new int[n]; // имаме масив за пълнене

		arrayLoop(array); // подаваме на метода нашия масив array
		System.out.println(Arrays.toString(array));
		
		sc.close();
	}

	static void arrayFillRecursive(int[] masiv, int i) { //рекурсивен метод за пълнене на масив с елементи със стойност, равна на съответния индекс
		if (i == masiv.length) {
			return;
		}
		masiv[i] = i;
		arrayFillRecursive(masiv, i + 1);
	}

	static int[] arrayLoop(int[] masiv) { // метод за пълнене на елементи на масив със стойност инедксите на масива

		for (int i = 0; i < masiv.length; i++) {
			masiv[i] = i;
		}
		return masiv;
	}
}