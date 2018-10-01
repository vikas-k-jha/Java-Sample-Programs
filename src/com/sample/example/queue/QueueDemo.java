package com.sample.example.queue;

public class QueueDemo {
	
	public static void main(String[] args) {
       
		Queue<Integer> newQueue = new Queue.Impl<Integer>(5);
		
		 newQueue.enQueue(10);
	     newQueue.enQueue(20);
	     newQueue.enQueue(30);
	     newQueue.enQueue(40);
	     newQueue.enQueue(50);
	     
	     System.out.println(newQueue.toString());
	     System.out.println(newQueue.deQueue().toString());
	     System.out.println(newQueue.deQueue().toString());
	     System.out.println(newQueue.toString());
	     
	}
}
