package WritingFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
	public static void main(String[] args) {
		File file = new File("test.txt");

		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(file))) {
			
			String line;
			bWriter.write("Line one");
			bWriter.newLine();
			bWriter.write("Line two");
			bWriter.newLine();
			bWriter.write("Line three");
			bWriter.newLine();
			bWriter.write("Last line");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
