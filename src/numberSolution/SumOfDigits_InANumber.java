package numberSolution;

public class SumOfDigits_InANumber {

	public static void main(String[] args) {
		
		int num=12345;
		
		int sum=0;
		
		while (num>0) {	
			sum=sum+num%10;
			num=num/10;	
		}
		System.out.println("Sum Of Digits In A Number: "+sum);

	}

}
