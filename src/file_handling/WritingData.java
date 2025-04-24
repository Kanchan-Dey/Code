package file_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

//writing data always removes the existing data in the file
public class WritingData {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata1\\Test1\\Gotham1\\pookie.txt";
		File file = new File(path);

		FileOutputStream fes = new FileOutputStream(file, true);
		// FileWriter fes = new FileWriter(file, true);
		String message = ", Tung tung tung sahur";
//byte[] arr = message.getBytes();
//fes.write(arr);

		for (int i = 0; i < message.length(); i++) {
			fes.write(message.charAt(i));
		} // when using filewriter we need to close the filewriter to add the filewriter
			// message because the data wont be returned unless the stream is closed, the
			// reason being that they are using a buffer storage which doesnt write data
			// until its completely filled unlike fileoutputstream, this is done to imrpove
			// efficiency when writing data many times.The drawback in this is that the
			// program might crash before the end , then all the info will rrmain in the
			// buffer and never get returned, so to prevent this we should start a
			// filewriter with a try with resource or just flush the data using a command.
			// it is similar to a savepoint or rollback command in database.
        //fes.flush();
		// Otherwise we use
		//fes.close();
	
	}
}
