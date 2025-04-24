package file_handling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\Test\\Demo\\demo.txt";
		String renamepath = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\Test\\Gotham\\demo.txt";

		File file = new File(renamepath);
		//File rename = new File(renamepath);

		file.mkdirs();
		//file.renameTo(rename);// renames only one file at a time

		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParentFile());
		System.out.println(file.getName());
		//file.delete();
		file.createNewFile();
//		String[] arr = file.list();
//		for(String s:arr)
//		{
//			System.out.println(s);
//		}
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
	}
}
