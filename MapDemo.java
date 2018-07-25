package collectiondemos;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("Sachin", 23000);
		map.put("Ahmed", 23500);
		map.put("Lola", 23000);
		map.put("Sachin", 23000);
		map.put("Nitin", 23000);
		System.out.println(map.get("Ahmed"));
		
		Set<Entry<String, Integer>> set = map.entrySet(); // Converting our treemap to set so that iteration can be performed
		
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next(); // Since treemap has 2 things: Key and value
			System.out.println(me.getKey()+ ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

	}

}
