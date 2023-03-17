package com.quedom;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Priorityqueue {

	public static void main(String[] args) 
	{
		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("Vishal");
		pq.add("Ganesh");
		pq.add("shubham");
		pq.add("sumit");
		pq.add("shubham");
		pq.add("sumit");
		
		System.out.println("Queue valuves=" + pq.element());
		System.out.println("Queue Head " + pq.peek());

		Iterator<String> itr = pq.iterator();

		while (itr.hasNext()) {

			System.out.println("Queue valuves " + itr.next());
		}

		System.out.println("Removing Elements ");
		pq.remove();
		pq.poll();

		System.out.println("Queue valuves=" + pq.element());
		System.out.println("Queue Head " + pq.peek());

		System.out.println("After Removing Elements");
		
		Iterator<String> itr1 = pq.iterator();

		while (itr1.hasNext()) {

			System.out.println("Queue valuves " + itr1.next());
		}
		
		
		//Starck onject 
		System.out.println("Started Stack");
		Stack<String> st=new Stack<String>();
		
		st.push(null);
		st.push("Stack value");
		st.push("Stack value");
		
		Iterator<String> sitr = st.iterator();
		for(String str1:st) {
			System.out.println("Stack Element : "+str1);
		}
		
		/*
		 * while(sitr.hasNext()) { System.out.println("Stack Valuves "+sitr.next()); }
		 */
			
		Deque<String> dq=new ArrayDeque<String>();
		
		dq.add("dequeue element1");
		dq.add("dequeue element2");
		dq.add("dequeue element3");
		dq.add("dequeue element4");
		
	    for(String str:dq) {
	    	
	    	System.out.println("Dequeue valuves "+str);
	    }
		

	}

}