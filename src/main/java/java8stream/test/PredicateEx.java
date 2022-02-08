package java8stream.test;

import java.util.*;
import java.util.function.Predicate;

/**
 * Predicate Example
 *
 */
public class PredicateEx {
	public static void main(String[] args) {
		Predicate<Integer> lessthan = x -> (x < 20);
		System.out.println(lessthan.test(5));
	}
}
