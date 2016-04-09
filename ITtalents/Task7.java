//Write a program that reads numbers A, B and C. A must be short. B and C must be < 7. The program 
//has to INVERT the bits from number A on positions B and C. Print the new value of A.

public class Task7 {

	public static void main(String[] args) {
		short a = 37;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		
		int b = 3;
		int c = 6;
		
		System.out.println();
		
		a = (short) (a ^ (1<<b));  //������ �� ������ 1�� �� ������� 3 �� ������������ �����
		System.out.println("1.(a ^ (1<<b))");
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		
		a = (short) (a ^ (1<<c));
		
		System.out.println();
		System.out.println("2.(a ^ (1<<c))"); //������� 1�� �� ������� 6, ������ ������ ��� 0�� � �� �������� ��-������ �����.
		System.out.println(a);
	
		System.out.println(Integer.toBinaryString(a));
	}
}
