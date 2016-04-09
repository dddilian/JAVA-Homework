//Чрез побитови операции изведете от числото 231, числото 772

public class HomeTask1 {

	public static void main(String[] args) {
		
		System.out.println("Задача 2 от учебника:");
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
		System.out.println("Задача 1 от учебника:");
	    byte x = 3;
	    System.out.println(x);   
	    System.out.println(Integer.toBinaryString(x));  //бинарен запис на оригиналното число
		
		
		byte oneRight = (byte) (x << 1);
		
		System.out.println(oneRight); 
		System.out.println(Integer.toBinaryString(oneRight)); //бинарен запис на новото шифтнато число
		
		System.out.println(x | oneRight); //ползваме побитово И, за да изкараме 7ца от бинарните записи на двете числа.
	}
}