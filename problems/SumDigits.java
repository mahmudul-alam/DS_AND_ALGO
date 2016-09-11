package problems;

/*
 * Given a non-negative int n, return the sum of its digits recursively (no loops). 
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). 
 * 
 * sumDigits(126) → 9
 * sumDigits(49) → 13
 * sumDigits(12) → 3
 * 
 */

public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(554));
	}

	private static int sumDigits(int number) {
		if (number <= 9) {
			return number;
		} else {
			return (number % 10) + sumDigits(number / 10);
		}
	}

}
