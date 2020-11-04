import java.util.Scanner;

public class CountNumberOfDigit_InNumber {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Numbers: ");
		int num = scanner.nextInt();
		
		int count=0;
		
		while (num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number Of digits: "+count);

	}

}
