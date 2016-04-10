package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> list = new Stack();

		list.push("California");
		list.push("NewYork");
		list.push("NewJersy");

		for(int i=0; i<=list.size()+1;i++) {
			System.out.println(list.pop());
		}

		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
