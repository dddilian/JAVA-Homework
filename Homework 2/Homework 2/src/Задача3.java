import java.util.Scanner;

public class «‡‰‡˜‡3 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter person's first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Enter person's last name: ");
		String lastName = input.nextLine();
		
		System.out.println("Enter person's age: ");
		byte age = input.nextByte();
		
		System.out.println("Enter person's gender. Enter \'m\' for male or \'f\' for female: ");
		char gender = input.next().charAt(0);
		
		if ((gender != 'm') && (gender != 'f')) {
			System.out.println("No such gender: ");
		}
		
		System.out.println("Enter person's ≈√Õ: ");
		long egn = input.nextLong();                       
		
		System.out.println("Enter person's gsm number: ");
	    int gsmNumber = input.nextInt();
		
		System.out.println("Person's first name is: " + firstName);
		System.out.println("Person's last name is: " + lastName);
		System.out.println("Person's age is: " + age);
		System.out.println("Person's gender is: " + gender);
		System.out.println("Person's ≈√Õ is: " + egn);
		System.out.println("Person's GSM number is: " + gsmNumber);
	}
}