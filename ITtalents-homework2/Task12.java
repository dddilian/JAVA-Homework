//�� �� ������� ��������, ����� ������� ������
//���������� ���������� �����, ����� ����� ������� ����� �.�.
//100,101, 606 � �.�. �� �� ��������.

public class Task12 {

	public static void main(String[] args) {
		
		for (int i = 100; i <= 999; i++) {
			
			int hundreds = i / 100;
			int tens = (i / 10) % 10;
			int ones = (i % 100) % 10;
			
			if (hundreds == tens || hundreds == ones || ones == tens) {
				continue;
				
			} else {
				System.out.println(i);
			}
		}
	}
}
