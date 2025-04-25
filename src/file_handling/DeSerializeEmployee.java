package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {
public static void main(String[] args) throws Exception{
	String path ="C:\\\\Users\\\\User\\\\Desktop\\\\FileHandlingKolkata1\\\\Test1\\\\Gotham1\\\\serialized.txt";
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(fis);
	Employee employee =(Employee)ois.readObject();
	System.out.println(employee);
	
}
}
