package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(performBinarySearch(a, 0, a.length - 1, 4));

	}

	private static int performBinarySearch(int[] a, int low, int high, int value) {

		if (low == high) {
			if (a[low] == value) {
				return low;
			} else {
				return -1;
			}
		} else {
			int midIndex = (low + high) / 2;
			if (a[midIndex] == value)
				return midIndex;
			else if (a[midIndex] > value) {
				return performBinarySearch(a, low, midIndex - 1, value);
			} else {
				return performBinarySearch(a, midIndex + 1, high, value);
			}
		}
	}

}
