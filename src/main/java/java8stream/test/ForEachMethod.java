package java8stream.test;

import java.util.*;

/**
 * ForEach loop Example
 *
 */
public class ForEachMethod {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Cupcake");
		list.add("Cookies");
		list.add("Brownies");
		list.add("Chocolate cake");

		list.forEach((dessert) -> System.out.println(dessert));
	}

}
