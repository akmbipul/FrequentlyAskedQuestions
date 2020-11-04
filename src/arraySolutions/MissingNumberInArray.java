package arraySolutions;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6};
		
		int sum1=0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum1 = sum1+a[i];
		}
		System.out.println("sum of elements in array "+sum1 );
		
		int sum2=0;
		
		for (int i = 0; i <= 6; i++) {
			
			sum2 = sum2+i;
			
		}
		System.out.println("sum os rang of elements in array "+ sum2);
		
		System.err.println("missing array number is "+(sum2-sum1));
		
	}

}
