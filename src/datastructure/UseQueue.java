package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue = new LinkedList<String>();
		queue.add("John");
		queue.add("Mary");
		queue.add("Ahmad");
		queue.add("Allan");
		queue.add("Olivia");
		queue.add("Marc");
		queue.add("Eli");
		queue.add("Martha");
		queue.add("Anna");
		queue.add("Zoe");

		//iterating queue with for each loop
		for(String queue2  : queue){
			System.out.println(queue2);
		}

		//iterating queue with Iterator
		Iterator iterator = (Iterator) queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(queue.peek());
		System.out.println("Size of queue before poll-ing: "+ queue.size());
		System.out.println(queue.poll());
		System.out.println("Size of queue after poll-ing: "+ queue.size());
		queue.remove("Anna");
		queue.remove("Zoe");
		System.out.println("Size of queue after polling and removal of two elements: "+ queue.size());

		queue.clear();
		System.out.println("polling after removing all the elements returns: "+queue.poll());
	}

}
