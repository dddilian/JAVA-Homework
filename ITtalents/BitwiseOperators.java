
public class BitwiseOperators {

	public static void main(String[] args) {
		short a = 3; // 0000 0011 = 3 
		short b = 5; // 0000 0101 = 5 
		
		System.out.println( a | b); // 0000 0111 = 7 
		
		System.out.println( a & b); // 0000 0001 = 1 
		
		System.out.println( a ^ b); // 0000 0110 = 6 
		
		System.out.println(~a & b); // 0000 0100 = 4 //първо се обръщат стойностите на битовете на А, тогава се комбинират с логическо "И" с тези на Б
		
		System.out.println(a << 1); // 0000 0110 = 6 //шифт 1 път наляво всички битове, за да се получи ново число от А
		
		System.out.println(a << 2); // 0000 1100 = 12 //шифт 2 пъти наляво всички битове на А, за да се получи ново число
		
		System.out.println(a >> 1); // 0000 0001 = 1

		System.out.println();
		
		
		int number = 0b110101;
		int invertedNumber = ~number;  // ~ NOT оператор - обръща стойностите на всички битове
		
		System.out.println(Integer.toBinaryString(number));         //110101 става:
		System.out.println(Integer.toBinaryString(invertedNumber)); //001010
		
		System.out.println();
		
		int x0 = 0b110101;
		int y0 = 0b111000;
		int z0 = x0 & y0;  //демо на на побитовия оператор "И"
		System.out.println(Integer.toBinaryString(z0));
		
		System.out.println();
		
		int x1 = 0b110101;
		int y1 = 0b111000;
		int z1 = x1 | y1; //демо на на побитовия оператор "ИЛИ"
		System.out.println(Integer.toBinaryString(z1));
		
		System.out.println();
		
		int x2 = 0b110101;
		int y2 = 0b111000;
		int z2 = x2 ^ y2;  //демо на на побитовия оператор "изключващо ИЛИ" (XOR)
		System.out.println(Integer.toBinaryString(z2));
		
		System.out.println();
		
		int x = 0b10000000000000000000000000000001;  //original number
		int xOneRight = x >> 1;
		int xOneLeft = x << 1;
		
		System.out.println("Original number");
		System.out.println(Integer.toBinaryString(x));  //10000000000000000000000000000001
		
		System.out.println();
		
		System.out.println("Shifted rignt by 1");
		System.out.println(Integer.toBinaryString(xOneRight)); //11000000000000000000000000000000
		
		System.out.println();
		
		System.out.println("Shifted left by 1");
		System.out.println(Integer.toBinaryString(xOneLeft));  //10
		
		System.out.println();
		
		int xTwoRight = x >> 2;
		int xTwoLeft = x << 2;
		
		System.out.println("Shifted rignt by 2");
		System.out.println(Integer.toBinaryString(xTwoRight)); //11100000000000000000000000000000
		
		System.out.println();
		
		System.out.println("Shifted left by 2");
		System.out.println(Integer.toBinaryString(xTwoLeft)); //100
		
		
		
	}
}
