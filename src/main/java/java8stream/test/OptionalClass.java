package java8stream.test;

import java.util.*;

/**
 * Optional Class
 *
 */


public class OptionalClass {
	
	public static void main (String[]args) {
	Optional<Integer> op
	 = Optional.of(9455);
	System.out.println("Optional: "
			             + op);
	System.out.println("Let's try Stream: ");
	op.stream().forEach(System.out::println);
	   
	
}
}