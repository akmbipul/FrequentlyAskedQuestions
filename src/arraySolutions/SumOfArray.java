package arraySolutions;

public class SumOfArray {
	public static void main(String[] args) {

		int a[]= {5,3,2,7,9};
		
		int sum=0;
		
		for (int i = 0; i <= a.length-1; i++) {
			
			sum = sum + a[i];	
		}
		
		System.out.println("Sum Of Array Elements: "+sum);
		
		
	}
}
