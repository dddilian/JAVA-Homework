//Да се състави програма, която чрез цикъл while извежда
//таблицата за умножение, но без повторение.
//Т.е. ако е изведено 4*5 не се извежда 5*4.

public class Task23 {

	public static void main(String[] args) {
		int counter = 1;
		int a = 1;
		int result = 1;

		while (counter <= 9) {

			while (a <= 9) {
				result = counter * a;
				System.out.print(counter + "*" + a + "=" + result + "; ");
				a++;
			}
			
			System.out.println();
			counter++;
			a = 1;
		}
	}
}