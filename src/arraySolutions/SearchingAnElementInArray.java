package arraySolutions;

public class SearchingAnElementInArray {
	
	public static void main(String[] args) {
		
		int a[]	= {20,30,50,60,40};
		
		int searchElement = 30;
		
		boolean flag = false;
		
		for (int i = 0; i < a.length; i++) {
			
			if (searchElement==a[i]) {
				
				System.out.println("found searching element in array "+searchElement);
				flag =true;
				break;
				
			}
			
		}
		if (flag==false) {
			
			System.out.println("element dont exist in Array..");
			
		}	
				
	}

}
