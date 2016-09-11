package problems;

public class Fibonacci {

	public static void main(String[] args) {
		int nth = 8;
		System.out.println("Fibonacci number of " + nth + " is " + fibonacci(nth));
	}

	private static int fibonacci(int nth) {
		if (nth <= 1) {
			return nth;
		} else {
			return fibonacci(nth - 2) + fibonacci(nth - 1);
		}
	}

}
