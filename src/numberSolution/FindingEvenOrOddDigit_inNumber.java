package numberSolution;

public class FindingEvenOrOddDigit_inNumber {

	//finding total numbers of even and odd numbers out of given number
	
	public static void main(String[] args) {
		
		int num = 1265764632;
		
		int odd_count=0;
		int eve_count=0;
		
		while (num>0) {
			int rem = num % 10;
			
			if (rem%2==0) {
				
				eve_count++;	
			}
			else {
				odd_count++;
			}
			
			num=num/10;
		}
		System.out.println("Total Numbers of Even Number: "+eve_count);
		System.out.println("Total Numbers of Odd Number: "+odd_count);

	}

}
