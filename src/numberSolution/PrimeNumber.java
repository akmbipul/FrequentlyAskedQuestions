package numberSolution;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Numbers: ");
		int num = scanner.nextInt();

		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) 
					
					count++;
		
			}
			if (count == 2) {
				
				System.out.println("its a prime number...");

			} else {
				
				System.out.println("its not a prime number...");
			}
		} else {
			
			System.out.println("its a prime number...");
		}

	}

}
