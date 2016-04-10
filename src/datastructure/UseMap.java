package datastructure;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Map<String, String> map = new LinkedHashMap<String, String>();

		map.put("UK", "London");
		map.put("USA", "New York");
		map.put("Australia", "Sydney");
		map.put("Germany", "Berlin");


		//......... Using foreach loop ................

		 for(Map.Entry<String, String> st:map.entrySet()){
		   System.out.println(st.getKey()+"------->"+st.getValue());
		}

		//............. using Iterator.....................

		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
