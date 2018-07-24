package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s);
		
		s.add(2, 10);
		System.out.println(s);
		s.remove(1);
		System.out.println(s);
		Iterator<Integer> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
