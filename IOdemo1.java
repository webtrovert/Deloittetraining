package iodemos;

import java.io.File;
import java.io.IOException;

public class IOdemo1 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("C:\\Batch");
		file1.mkdir();
		File file = new File("C:\\Batch\\Batchmates.txt");
		file.createNewFile();
			
			System.out.println("File created inside Batch folder");
			
			File folder = new File("C:\\");
			File[] listOfFiles = folder.listFiles();

			for (int i = 0; i < listOfFiles.length; i++) {
			  if (listOfFiles[i].isFile()) {
			    System.out.println("File " + listOfFiles[i].getName());
			  } else if (listOfFiles[i].isDirectory()) {
			    System.out.println("Directory " + listOfFiles[i].getName());
			  }
			}
		}

	}


