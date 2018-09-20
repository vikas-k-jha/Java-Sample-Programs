/**
 * Example lamda expression 
 * LamdaExpressionDemo.java
 */
package com.sample.example.java8;

interface LamdaExpression {
	void display();
}

/**
 * <br> Problem Statement :
 *  
 * Lamda Expression demo
 * 
 * </br>
 * 
 * @author Vikas Jha
 */
public class LamdaExpressionDemo {

	public static void main(String[] args) {
		
		/*
		 * 1 - Implement interface using anonymous class - traditional way
		 * We can notice it will create anonymous class - LamdaExpressionDemo$1.class
		 * 
		 */
		new LamdaExpression () {
			@Override
			public void display () {
				System.out.println("Implement interface using anonymous class!");
			}
			
		}.display();
		
		/*
		 *  2 - Implement interface using anonymous class - lamda expression
		 *  We can notice lamda expression will not create any anonymous class
		 */
		LamdaExpression lamda = () -> System.out.println("Implement interface using lamda expression!");
		lamda.display();
	}

}
