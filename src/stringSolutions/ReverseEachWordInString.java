package stringSolutions;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		
		String[] words = s.split(" ");
		
		String reverseString = "";
		
		for (String w : words) {
			
			String reverseWord="";
			
			for (int i = w.length()-1; i>=0; i--) {
				
				reverseWord = reverseWord+w.charAt(i);
			}
			
			reverseString= reverseString +reverseWord+" ";
		}
		
		System.out.println(reverseString);
		
		
		
		
   }
}