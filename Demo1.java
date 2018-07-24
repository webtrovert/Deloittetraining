package collectiondemos;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		//Set s = new TreeSet();//sorts in ascending order and removes duplicates
		//List s = new List();
		//List s = new LinkedList();
		Set<String> s = new LinkedHashSet<String>(); // - This will remove duplicate and show as it is.
		//Set s = new HashSet() - This will remove duplicates but show O/P in random order
			s.add("Neha");
			s.add("Kalpana");
			s.add("Arun");
			s.add("Zeba");
			s.add("Neha");
			//s.add(true); // can't add since we have specified argument as String
			//s.clear(); // will clear all outputs
			System.out.println(s.contains("Anu"));
			
			System.out.println(s);// by default s.toString.
			// To print one by one, use ITERATOR (or enhanced for loop)
			Iterator<String> i = s.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
		
}
	}
