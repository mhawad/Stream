package java8stream.test;

import static java.util.stream.Collectors.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Collectors Example
 *
 */

public class CollectorsClass {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sam", "Justin", "Steven", "Bavly");

		Map<String, Long> map = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

	}

}
