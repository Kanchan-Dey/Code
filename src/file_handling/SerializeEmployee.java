package file_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata1\\Test1\\Gotham1\\serialized.txt";
		File file = new File(path);
		// file.createNewFile();
		Employee employee = new Employee(1, "kanchan", 29.0);
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);//it is used to serialize the employee object
		oos.writeObject(employee);
		oos.flush();
		oos.close();
		fos.close();
	}
}
