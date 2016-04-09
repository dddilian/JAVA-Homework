import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to see if is palindrome: ");
		String word = sc.nextLine();
		
		System.out.println("Word is palindrome? " + isPalindrome(word));
		sc.close();
	}

	public static boolean isPalindrome(String str) { //For a string to be a palindrome first and last letter must be the same,  
		if (str == null || (str.length() <= 1)) {    //and then when you remove those two letters the string that remains
			return true;                             // must also have first and second letter that match, and so on
		}                                            //....until there is no more letters that can form a string or there is one "middle" letter.
		return isPalindrome(str.substring(1, str.length() - 1)) && str.charAt(0) == str.charAt(str.length() - 1);
	}
}