package stringSolutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.text.AbstractDocument.BranchElement;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("");
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write("welcome to java");
		bufferedWriter.write("Java is a progamming language");
		
		System.out.println("Finished...!");
		
		bufferedWriter.close();
	}
	
}
