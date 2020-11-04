package stringSolutions;

public class CountOccurrenceOfChars_InString {
	
	public static void main(String[] args) {
		
		String s = "java programming java oops";
		
		int totalCount=s.length();
		
		int totalCount_AfterRemovingChars = s.replaceAll("a", "").length();
		
		int count  = totalCount-totalCount_AfterRemovingChars;
		
		System.out.println("Number of occurence of a is : "+count);
		
	}
}
