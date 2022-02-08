package java8stream.test;

/**
 * Functional Interface Example
 *
 */
@FunctionalInterface

interface functional {
	void play(String msg);

}

public class FunctionalInterfaces implements functional {
	public void play(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaces hello = new FunctionalInterfaces();
		hello.play("Let's test functional interface");
	}
}
