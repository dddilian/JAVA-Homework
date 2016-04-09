
public class ConvertToNumeralSystems {

	public static void main(String[] args) {
		
        int x = 28;                   //28 in decimal
		
		int xBin = 0b11100;           //28 in binary - ���� ������� �� ����� 0b, �� �� ������� ������� �����
		int xHex = 0x1C;              //28 in hexadecimal - ���� ������� �� ����� 0x, �� �� ������� ��������������� �����
		int xOct = 034;               //28 in octal decimal - ���� ������� �� ����� ���� 0, �� �� ������� ������� �����
		
		System.out.println(x);
		System.out.println(xBin);
		System.out.println(xHex);
		System.out.println(xOct);
		
		System.out.println();
		
		int number1 = 24;
		int number2 = 372;
		
		System.out.println(Integer.toBinaryString(number1));
		System.out.println(Integer.toBinaryString(number2));
		
		System.out.println();
		
		System.out.println("Other transformations:");
		
		int number3 = 11; 
		
		System.out.println(Integer.toString(number3, 2));  //transform into binary
		
		System.out.println(Integer.toString(number3, 8));  //transform into octal decimal
		
		System.out.println(Integer.toString(number3, 16)); //transform into hexadecimal
		
		
		System.out.println();
		
		System.out.println(Integer.parseInt("11010101", 2));  //from binary to decimal
		
		System.out.println(Integer.parseInt("4D3", 16));      //hexadecimal to decimal

	}
}
