package iodemos;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("a.txt");
		//Opening the file in 2 modes, rw - read write
		RandomAccessFile ra = new RandomAccessFile(f, "rw");
		// To append and not over write what we are writing :
		ra.seek(ra.length());
		//Writing
		ra.writeUTF("Hello hi khana kha ke jana");
		ra.seek(0);
		
		
		
		
		System.out.println("The content of the file is:");
		try {
			do {
				String n = ra.readUTF();
				System.out.println(n);
			} while (true);
		} catch (Exception e) {
		
		}
		
		ra.close();
	}

}
