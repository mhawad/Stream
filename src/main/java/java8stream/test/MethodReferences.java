package java8stream.test;

/**
 * Methods Reference Example
 *
 */
interface Method {
	void play();
}

public class MethodReferences {
	public static void playNewgame() {
		System.out.println("Hi, let's test this method!");
	}

	public static void main(String[] args) {
		Method method = MethodReferences::playNewgame;
		method.play();
	}

}
