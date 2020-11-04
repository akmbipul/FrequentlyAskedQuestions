package numberSolution;
import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Numbers: ");
		int num = scanner.nextInt();

//		Using Algorithm
		
		  int rev =0;
		  
		  while (num!=0) {	
			rev=rev*10+num%10; //(num%10)will show the last digit and save that into rev
			num= num/10; //(num/10) will eliminate the last digit and save rest of the numbers in to num
		}
		  System.out.println("Reverse number Is: "+rev);

//     Using String Buffer

		StringBuffer stringBuffer = new StringBuffer(String.valueOf(num));
		StringBuffer reverse = stringBuffer.reverse();

		System.out.println("Reverse number Is: " + reverse);

//		  Using String Builder
		StringBuilder stringBuilder= new StringBuilder();
		stringBuilder.append(num);
		StringBuilder reverse1=stringBuilder.reverse();
		
		System.out.println("Reverse number Is: " + reverse1);	

	}

}
