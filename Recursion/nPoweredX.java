import java.util.Scanner;

public class nPoweredX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to be powered: ");
		int n = sc.nextInt();
		
		System.out.println("Enter value for power: ");
		int x = sc.nextInt();
		
		int result = power(n,x);
		
		System.out.println(result);
		
		sc.close();
	}

	static int power(int n, int m) {  //метод с рекурсия за число на степен
		
		if (m == 0) {
			return 1;
		}
		
		if (m == 1) {
			return n;
		}
		
		return n*power(n,m-1);
	}
}
