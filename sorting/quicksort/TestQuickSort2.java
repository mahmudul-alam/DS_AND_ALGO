package sorting.quicksort;

import java.util.Arrays;

public class TestQuickSort2 {

	public static void main(String[] args) {
		int[] a = {7, 6, 9, 13, 3, 2};
		System.out.println("Before quick Sort: ");
		System.out.print(Arrays.toString(a));
		System.out.println();
		quickSort(a, 0, a.length - 1);
		System.out.println("After Quick Sort: ");
		System.out.print(Arrays.toString(a));
	}

	private static void quickSort(int arr[], int l, int h) {
		if (l < h) {
			int p = partition(arr, l, h); /* Partitioning index */
			quickSort(arr, l, p - 1);
			quickSort(arr, p + 1, h);
		}
	}

	private static int partition(int arr[], int l, int h) {
		int x = arr[h]; // pivot
		int i = (l - 1); // Index of smaller element

		for (int j = l; j <= h; j++) {
			// If current element is smaller than or equal to pivot
			if (arr[j] <= x) {
				i++; // increment index of smaller element
				swap(arr, i, j); // Swap current element with index
			}
		}
		return (i);
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
