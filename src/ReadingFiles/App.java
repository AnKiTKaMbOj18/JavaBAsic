package ReadingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file = new File("dumy.tsxt");
		BufferedReader bReader = null;
		try {
			FileReader fileReader = new FileReader(file);
			bReader = new BufferedReader(fileReader);

			String line;
//			line = bReader.readLine();
//			System.out.println(line);

			while ((line = bReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not found: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("unable to read file: " + file.toString());
		} finally {
			try {
				bReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("unable to close file: " + file.toString());
			} catch (NullPointerException ex) {
				// file was never opened
				System.out.println("");
			}
		}

	}
}
