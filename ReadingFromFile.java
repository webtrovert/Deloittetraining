package iodemos;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFromFile {

	public static void main(String[] args) throws IOException {
		String n;
		int p = 0;
		int q = 0;
		
		DataInputStream stream = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("myrec.txt"))));
		
		n= stream.readUTF();
		p= stream.readInt();
		q = stream.readInt();
		
		System.out.println(n+", Your total bill is:" +(p*q));
		stream.close();
		
	}

}
