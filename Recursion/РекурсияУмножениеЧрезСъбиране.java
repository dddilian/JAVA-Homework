import java.util.Scanner;

public class РекурсияУмножениеЧрезСъбиране {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("Enter power: ");
		int m = sc.nextInt();

		int result1 = recMultiAdd(n, m);
		System.out.println(result1);
		
		int result2 = powerRecursively(n, m);
		System.out.println(result2);
		sc.close();

	}

	public static int recMultiAdd(int num, int pow) { // рекурсивен метод,който умножава едно число по друго
		                                              // или с други думи - събира го със себе си, m брой пъти

		if (num == 0 || pow == 0) { // проверки за дъно на рекурсията
									// 0 по всяко число е 0
			return 0;			    // и всяко число умножено по 1 дава себе си
		}
		
		if (pow == 1) {
			return num;
		}
		return num + recMultiAdd(num, pow - 1);
	}
	
	static int powerRecursively(int num, int power) { // рекурсивен метод за умножение чрез събиране
		
		if (power == 0) {   // дъно на рекурсията - за степени 0 и 1 знаем отговора
		return 1;
		}
		if (power == 1) {
		return num;
		}
		
		return num + powerRecursively(num, power - 1); // в останалите случаи викаме метода, за да пресметне числото,
		                                               // вдигнато на степен с 1 по-малка, и умножаваме числото по този резултат
		}
}