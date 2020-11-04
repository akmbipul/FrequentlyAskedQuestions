package numberSolution;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		
		int a=40;
		int b=30;
		
		a=a+b;//		methot1
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
	
		a=a*b;//		method2
		b=a/b;
		a=a/b;
		
		
		System.out.println(a+" "+b);
		
		
		b=a+b-(a=b);//		method3
		
		System.out.println(a+" "+b);

	}

}
