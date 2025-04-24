package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingImage {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata1\\Test1\\Gotham1\\windows.png";
		File destinationFile = new File(path);
		destinationFile.createNewFile();
		String src = "C:\\Users\\User\\Pictures\\Screenshots\\kaa.png";
		File srcfile = new File(src);
		FileInputStream fis = new FileInputStream(srcfile);
		byte[] arr = new byte[(int) srcfile.length()]; // getting rthe size of source file and creating a byte array of
														// size to store image data in the form of byte
		fis.read(arr);// reads data from file and stores it into the byte array
		FileOutputStream fos = new FileOutputStream(destinationFile);
		fos.write(arr);
		fis.close();
		fos.close();//it is a good practice to close any stream you open
	}
}
