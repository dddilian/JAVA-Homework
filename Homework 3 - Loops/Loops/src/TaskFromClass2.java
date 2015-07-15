
public class TaskFromClass2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0 || i % 11 == 0) {         //на 7 ИЛИ 11 без остатък
				System.out.println(i);
			}
		}
	}
}