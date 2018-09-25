/**
 * Example 'forEach' method from Iterable interface
 * Iterable_forEachDefaultmethod.java
 */
package com.sample.example.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * <br>
 * Problem Statement :
 * 
 * Iterating through a Collection in Java - using 'forEach' v/s traditional
 * approach.
 * 
 * </br>
 * 
 * @author Vikas Jha
 */
public class Iterable_forEachDefaultmethod {

	public static void main(String args[]) {

		List<String> stringList = Arrays.asList("ABC", "DEF", "XYZ", "MNO");

		// 1 - Iterate collection using 'for' loop
		System.out.println("## 1 - Iterate using 'for' loop");
		for (int i = 0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}

		// 2 - Iterate collection using foreach loop
		System.out.println("\n\n## 2 - Iterate using foreach loop");
		for (String str : stringList) {
			System.out.println(str);
		}

		// 3 - Iterate collection using iterator abstract method
		System.out.println("\n\n## 3 -Iterate using 'iterator' abstract method");
		Iterator<String> itr = stringList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// 4 - Iterate collection using Java-8 - 'forEach' method
		System.out.println("\n\n## 4 - Iterate using 'forEach' default method");
		stringList.forEach(System.out::println);
	}

}
