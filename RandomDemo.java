package iodemos;

import java.util.Random;

public class RandomDemo {
	
	
	public static void main(String[] args) {
		//Prints random number from 10 to 20
		Random random = new Random();
		
		int k = random.nextInt(10);
		System.out.println(k+10);
	}

}
