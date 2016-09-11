package problems;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] a = { -3, 2, 5, 1 };
		System.out.println(maxSubArray(a, 0, a.length-1));

	}

	// brute force

	private static int maxSubArray(int[] a, int l, int h) {
		if (l == h) {
			return a[0];
		}

		int m = (l + h) / 2;

		int left_mss = maxSubArray(a, l, m);
		int right_mss = maxSubArray(a, m + 1, h);

		int left_sum = Integer.MIN_VALUE, right_sum = Integer.MIN_VALUE, sum = 0;

		// find the left sub array max
		for (int i = m; i >= 0; i--) {
			sum += a[i];
			if (sum > left_sum) {
				left_sum = sum;
			}
		}

		// initialize sum
		sum = 0;
		
		// find the right sub array max
		for (int i = m+1; i <= h; i++) {
			sum += a[i];
			if (sum > right_sum) {
				right_sum = sum;
			}
		}
		
		int ans = Math.max(left_mss, right_mss);
		return Math.max(ans, left_sum+right_sum);

	}

}
