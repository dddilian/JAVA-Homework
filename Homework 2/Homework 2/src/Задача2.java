public class Задача2 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 8;
		System.out.println("Value of a and b before swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);	
		
		              
		a = a + b; 
		b = a - b; 
		a = a - b; 
		
		System.out.println();
		
		System.out.println("Value of a and b after swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}