/**
 * Example Java Stack Demo
 * Stack.java
 */
package com.sample.example.stack;


/**
 * Stack example with pop and push
 * 
 * @author Vikas Jha
 *
 */
public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack.Impl<Integer>(5);

		// Print empty stack
		System.out.println(stack.toString());

		// Push 5 integer value into stack
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		stack.push(30);

		// Test pop
		System.out.println(stack.toString());
		System.out.println("POP 1st element - " + stack.pop());
		System.out.println("POP 2nd element - " + stack.pop());
		System.out.println(stack.toString());
	}
}
