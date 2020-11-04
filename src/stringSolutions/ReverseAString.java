package stringSolutions;
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter a String: ");
		String string = scanner.next();
		
//		Using String Buffer
		
		StringBuffer stringBuffer = new StringBuffer(string);
		StringBuffer revString = stringBuffer.reverse();
		
		System.out.println("Reversed String is : "+revString);
		
//		Using String Builder
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(string);
		StringBuilder reverse = stringBuilder.reverse();
		
		System.out.println("Reversed String is : "+revString);
		
//		Using string concatenation Operator
		
		String rev = "";
		int length= string.length();
		
		for (int i = length-1; i >= 0; i--) {
			
			rev= rev+string.charAt(i);
		}
		
		System.out.println("Reversed String is : "+rev);
		
	}

}
