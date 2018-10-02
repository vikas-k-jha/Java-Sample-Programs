/**
 * Example Java Stack  
 * Stack.java
 */
package com.sample.example.stack;

import java.util.Arrays;

/**
 * @author Vikas jha
 *
 * @param <T>
 */
public interface Stack<T> {

	public void push(T value);
	public T pop();
	public boolean isEmpty();

	public class Impl<T> implements Stack<T> {

		private int top;
		private int size;
		private T[] stack;

		@SuppressWarnings("unchecked")
		Impl(int size) {
			this.size = size;
			this.stack = (T[]) new Object[size];
			top = -1;
		}

		@Override
		public void push(T value) {
			if ((top + 1) == size) {
				throw new IllegalStateException("Stack is full");
			} else {
				top = top + 1;
				stack[top] = value;
			}
		}

		@Override
		public T pop() {
			T value = null;
			if (isEmpty()) {
				throw new IllegalStateException("Stack is empty");
			} else {
				value = stack[top];
				stack[top] = null;
				top = top - 1;
			}
			return value;
		}

		@Override
		public boolean isEmpty() {
			return (top == -1);
		}

		@Override
		public String toString() {
			return "Stack [top=" + top + ", stack=" + Arrays.toString(stack) + "]";
		}

	}
}