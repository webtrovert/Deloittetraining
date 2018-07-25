package iodemos;

import java.util.*;

public class EnumerationDemo {
	public static void main(String[] args) {
		Properties p = System.getProperties(); // Will list all the System information
		Enumeration <Object> e = p.elements();
		while(e.hasMoreElements())
		{
			System.out.println("The value is:" +e.nextElement());
		}
	}
}
