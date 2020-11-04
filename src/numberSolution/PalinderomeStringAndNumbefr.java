package numberSolution;
import java.util.Scanner;

public class PalinderomeStringAndNumbefr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Numbers: ");
		int num = scanner.nextInt();
		
		int orgNum= num;
		
//		Using Algorithm
		int reverse =0;
		while (num!=0) {
			
			reverse = reverse*10+num%10;
			num=num/10;
		}
		if (orgNum == reverse) {

			System.out.println("It is a palindrome Number...");

		} else {

			System.out.println("It is Not a palindrome Number...");
		}

		System.out.println("Please Enter a String: ");
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
