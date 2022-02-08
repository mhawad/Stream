package java8stream.test;

/**
 * Static Method Example
 *
 */
@FunctionalInterface
public interface MethodReferenceStatic {
	public String playGame(Integer str);

	public static String newMethod(Integer num) {
		return "Let's test static method: " + num;
	}

	public class StaticMethodsInterface {
		public static void main(String[] args) {

			MethodReferenceStatic static1 = (x) -> {
				return "Welocme" + x;
			};

			System.out.println(static1.playGame(43));

		}
	}
}