package com.sample.example.queue;

import java.util.Arrays;

public interface Queue<T> {
	
	public void enQueue(T t);
	public T deQueue();
	public boolean isEmpty();
	
	public class Impl<T> implements Queue<T> {

		private int front;
		private int rear;
		private int size;
		T[] queue;
		
		@SuppressWarnings("unchecked")
		Impl(int queue_size){
			size = queue_size;
	        queue = (T[]) new Object[size];
	        front = -1;
	        rear = -1;
		}
		
		@Override
		public void enQueue(T value) {
			
			if ((rear+1)%size==front) { 
				throw new IllegalStateException("Queue is full");
			} else if (isEmpty()) {
	            front++;
	            rear++;
	            queue[rear] = value;

			} else {
	            rear=(rear+1)%size;
	            queue[rear] = value;

			}	
		}

		@Override
		public T deQueue() {
			
			T value = null;
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty, cant dequeue");
	        } else if (front == rear) {
	            value = queue[front];
	            front = -1;
	            rear = -1;

	        } else {
	            value = queue[front];
	            front=(front+1)%size;

	        }
	        return value;
		}

		@Override
		public boolean isEmpty() {			
			 return (front == -1 && rear == -1);
		}
		
		@Override
		public String toString() {
			return "Queue [front=" + front + ", rear=" + rear + ", size=" + size
	                + ", queue=" + Arrays.toString(queue) + "]";
		}	
	}

}
