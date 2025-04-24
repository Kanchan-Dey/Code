package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingData {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata1\\Test1\\Gotham1\\pookie.txt";
		File file = new File(path);
		// file.mkdirs();if i dont comment this after the first creation of folders it keeps making txt folders not txt files
		file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		int x;
		while ((x = fis.read()) != -1) {
			System.out.println((char) x);
		}

	}
}
