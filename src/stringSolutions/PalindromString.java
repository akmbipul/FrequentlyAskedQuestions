package stringSolutions;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {

		System.out.println("Please Enter a String: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String string = scanner.next();
		
//		Using string concatenation Operator
		String rev = "";
		
		int length= string.length();
		
		for (int i = length-1; i >= 0; i--) {
			
			rev= rev+string.charAt(i);
		}
		
		if (string.equals(rev)) {

			System.out.println("It is a palindrome String...");

		} else {

			System.out.println("It is Not a palindrome String...");
		}
		
	}

}
