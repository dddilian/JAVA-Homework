import java.util.Scanner;

public class Task11VerticalHorizontalMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.print("Enter the number of rows: ");
		int rows = input.nextInt();
		System.out.print("Enter the number of collums: ");
		int cols = input.nextInt();

		int[][] matrix = new int[rows][cols];
		int a = 1;

		// ��������� ������������ � ���������
		for (int row = 0; row < matrix.length; row++) { 
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = a;
				a++;
			}
			System.out.println();
		}
		// ���������� ���������� �� �������, ������-�������:
		for (int col = 0; col < matrix.length; col++) // ��� ����� ������ ��������,
		{
			for (int row = 0; row < matrix.length; row++) // � ����� ��������
			{

				System.out.print(matrix[row][col] + " ");
			}
			System.out.println(); // �� �� � ����� ��� �� ��� ���
		}
		System.out.println();

		// �� �� �������� �� ��������� ����� ������������� �������� ����� /�������/:
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.printf("%d ", matrix[row][col]);
			}
			System.out.println();
		}
		input.close();
	}
}
