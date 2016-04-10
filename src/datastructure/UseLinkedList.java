package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		LinkedList<String> list = new LinkedList<String>();
		list.add("NY");
		list.add("CA");
		list.add("AZ");

		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(int i=0; i<=list.size()+1;i++) {
			System.out.println(list.peek());
		}

	}

}
