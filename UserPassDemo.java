package iodemos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UserPassDemo {
// Here we are creating a separate file containing the username and password for ease of use
	
	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("c:\\Mydata\\config.properties");// Save the file with this name only since we will be using it as properties
		Properties properties = new Properties();
		properties.load(stream); //It will load the property key and value
		
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("The Username is: " +username);
		System.out.println("The Password is: " +password);
		stream.close();
		//Now even if we change the username or password, we dont have to make any changes to the code


	}

}
