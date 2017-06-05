package kot.kotsnow.ookEditor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOperationHandler {

	public void open(String filePath){

	}

	public void save(String content, File file){

		try {
			PrintWriter out = new PrintWriter(file);
			out.println(content);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
