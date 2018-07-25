package collectiondemos;

import java.util.*;

public class GenericDemo<Z> //Here we are adding 'Z' to make it generic type so that it can take any datatype we want.
// Also we can use any alphabet in place of Z
{
	

	
	public void display(Z name)
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		GenericDemo<Integer> d = new GenericDemo<Integer>();
		d.display(23);
		GenericDemo<String> d1 = new GenericDemo<String>();
		d1.display("Yo");
		
		Set s = new HashSet();

	}

}
