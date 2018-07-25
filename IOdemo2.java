package iodemos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class IOdemo2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Mydata\\A.txt");
		
		if(file.exists())
		{
			FileReader reader = FileReader(file);
			int i;
			int c = 0;
			while((i=reader.read())!= -1)
			{
				c++;
			}
			File file2 = new File("C:\\Mydata\\B.txt");
			file2.createNewFile();
			File OutputStream os = new OutputStream(file2);
			writer.write(file);
			
		}
		else
		{
			System.out.println("File A not found!");
		}
	}

	private static FileReader FileReader(File file) {
		// TODO Auto-generated method stub
		return null;
	}

}
