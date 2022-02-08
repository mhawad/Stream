package java8stream.test;

/**
 * Lambda Expressions Example
 *
 */

interface Lambda {
	public String play();
}

public class LambdaExpressions {
	public static void main(String[] args) {
		Lambda t = () -> {
			return "Lambda expressions saves time.";
		};
		System.out.println(t.play());
	}
}
