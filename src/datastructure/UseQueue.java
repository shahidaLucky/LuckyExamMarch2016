package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> line = new LinkedList<>();
		line.add("LA");
		line.add("NewYOrk");
		line.add("NewJersy");

		Iterator it = line.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(int i=0; i<=line.size()+1;i++) {
			System.out.println(line.peek());
		}
		for(int i=0; i<=line.size()+1;i++) {
			System.out.println(line.remove());
		}

	}
	}
