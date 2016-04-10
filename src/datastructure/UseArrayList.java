package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);

		Random r = new Random();
		System.out.println(list.get(r.nextInt(list.size())));
//using for each loop

		for(Integer number:list)
		{
			System.out.println(number);
		}
//using Iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
