
public class ConvertToNumeralSystems {

	public static void main(String[] args) {
		
        int x = 28;                   //28 in decimal
		
		int xBin = 0b11100;           //28 in binary - пред числото се слага 0b, за да разчете бинарен запис
		int xHex = 0x1C;              //28 in hexadecimal - пред числото се слага 0x, за да разчете шестнадесетичен запис
		int xOct = 034;               //28 in octal decimal - прес числото се слага само 0, за да разчете осмичен запис
		
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
