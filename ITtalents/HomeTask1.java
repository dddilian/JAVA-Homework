//���� �������� �������� �������� �� ������� 231, ������� 772

public class HomeTask1 {

	public static void main(String[] args) {
		
		System.out.println("������ 2 �� ��������:");
		short a = 231;

		System.out.println(Integer.toBinaryString(a));
		System.out.println(a);
		System.out.println();
		
		a = (short) (a << 2);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a);

		a = (short) (a ^ (1<<3));
		a = (short) (a ^ (1<<4));
		a = (short) (a ^ (1<<7));
		
		System.out.println();
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a);
		
		System.out.println();
		System.out.println("������ 1 �� ��������:");
	    byte x = 3;
	    System.out.println(x);   
	    System.out.println(Integer.toBinaryString(x));  //������� ����� �� ������������ �����
		
		
		byte oneRight = (byte) (x << 1);
		
		System.out.println(oneRight); 
		System.out.println(Integer.toBinaryString(oneRight)); //������� ����� �� ������ �������� �����
		
		System.out.println(x | oneRight); //�������� �������� �, �� �� �������� 7�� �� ��������� ������ �� ����� �����.
	}
}