package stringSolutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("");
		
		BufferedReader bR = new BufferedReader(fr);
		
		String str;
		
		while ((str = bR.readLine())!=null) {
			
			System.out.println(str);
		}
		
		bR.close();
		
		//Approch 2
		
		File file = new File("");
		
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNextLine()) {
			
			System.out.println(scanner.nextLine());
		}
		
		//Approch 3
		
        File fl = new File("");
		
		Scanner sc = new Scanner(fl);
		
		sc.useDelimiter("\\z");
		
		System.out.println(sc.next());
		
	}
	
}
