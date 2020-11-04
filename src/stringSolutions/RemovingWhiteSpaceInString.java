package stringSolutions;

public class RemovingWhiteSpaceInString {

	public static void main(String[] args) {
		
		String s = "java  is    my   strongest language"; 
		
		s = s.replaceAll("\\s", "");
		
		System.out.println("after removing all space : "+s);
		
	}
}
