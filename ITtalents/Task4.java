
public class Task4 {
	public static void main(String[] args) {
		
		int x = 13;
		
		boolean isPrime = true;
		
		for(int i = 2; i<x; i++) {  //����� �� i=2, �� �� ������� ��������� � �� ����� ����� �� �, � ��� ��� ������, ����� � �� � ������
			if(x % i == 0) {
				isPrime = false; // �������� ����� false
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime!");
		}	
	}
}
