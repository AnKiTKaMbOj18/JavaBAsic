package ReadWriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
	public static void main(String[] args) throws FileNotFoundException {
		String path = System.getProperty("user.dir");
		String fileName = "dumy.txt";
		File textFile = new File(fileName);
		Scanner sc = new Scanner(textFile);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}

		sc.close();
	}
}
