package java8stream.test;

/**
 * Functional Interface Example
 *
 */
interface Default {
	default void play() {
		System.out.println("Let's test default method");
	}

	void playMore(String msg);

}

public class DefaultMethods implements Default {
	public void playMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods test = new DefaultMethods();
		test.play();
		test.playMore("Calling an abstract method");
	}

}
