package java8stream.test;

import java.util.*;
import java.util.function.BiFunction;

/**
 * BiFunction Example
 *
 */

public class BiFunctoinEx {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> func = (y1, y2) -> y1 + y2;

		Integer result = func.apply(2, 3);
		System.out.println(result);

	}

}
