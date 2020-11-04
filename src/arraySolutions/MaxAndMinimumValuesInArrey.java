package arraySolutions;

public class MaxAndMinimumValuesInArrey {
	
	public static void main(String[] args) {
		
		int a[]= {80,77,65,46,22,94,30};
		
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i]>max) {
				
				max= a[i];
			}
			
		}
		
		System.err.println("Maximum value in array is "+max);
		
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]<min) {
				
				min = a[i];
			}
		}
		
		System.out.println("Minumum value in array is "+min);
		
	}

}
