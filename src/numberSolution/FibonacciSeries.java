package numberSolution;

public class FibonacciSeries {
public static void main(String[] args) {
	
	// fibonacci Series - 0,1,2,3,5,8,13,21.....100

			int a = 1;
			int b = 2;
			
			int sum;

			System.out.print("Fibonacci Series:");

			for (int i = 0; i <= 10; i++) {
				sum = a+b;
				a = b;
				b = sum;
				System.out.print(sum + " ");
			}
}
}
