package arraySolutions;

public class EvenOddFromArray {
	public static void main(String[] args) {

		int a[] = { 2, 5, 4, 7, 3, 9, 8 };

		System.out.println("Even Numbers In Array: ");
		
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				System.out.print(a[i] + " ");

			}
		}
		System.out.println();
		
		System.out.println("Odd Numbers In Array: ");

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				System.out.print(a[i] + " ");
			}
		}
		
//		for (int value : a) {
//			
//		if (a[i] % 2 == 0) {
//				System.out.print(a[i] + " ");
//			}
//		} we can use for each loop instead of for loop to get the same result

	}
}
