package problems;

import java.util.Arrays;

public class DivideAndConquer {

	public static void main(String[] args) {

		// array initialization
		int[] a = { 12, 1, 3, 11, 98, 21, 45 };

		// reverse array items
		System.out.println("Before reverse: " + Arrays.toString(a));
		reverseArray(a, 0, a.length - 1);
		System.out.println("After reverse: " + Arrays.toString(a));

		System.out.println();

		// merge sort
		System.out.println("Before Merge sort: " + Arrays.toString(a));
		mergeSort(a, 0, a.length - 1);
		System.out.println("After Merge sort: " + Arrays.toString(a));

		int[] tempMergeArray = Arrays.copyOf(a, a.length);

		System.out.println();

		// quick sort
		System.out.println("Before Merge sort: " + Arrays.toString(a));
		quickSort(a, 0, a.length - 1);
		System.out.println("After Merge sort: " + Arrays.toString(a));
		int[] tempQuickArray = Arrays.copyOf(a, a.length);

		// compare two sort results
		System.out.println("Are Both Merge and Quick Sort produced same result? "
				+ (compareArrays(tempMergeArray, tempQuickArray) == true ? "Yes" : "No"));

	}

	private static void reverseArray(int[] a, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			reverseArray(a, l, m);
			reverseArray(a, m + 1, r);
			reverse(a, l, m, r);
		}
	}

	private static void mergeSort(int[] a, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(a, l, m);
			mergeSort(a, m + 1, r);
			merge(a, l, m, r);
		}
	}

	private static void reverse(int[] a, int l, int m, int r) {
		int leftArraySize = m - l + 1;
		int rightArraySize = r - m;
		int L[] = new int[leftArraySize];
		int R[] = new int[rightArraySize];

		// fill temp array with original array data
		for (int i = 0; i < leftArraySize; i++) {
			L[i] = a[l + i];
		}

		for (int i = 0; i < rightArraySize; i++) {
			R[i] = a[m + i + 1];
		}

		// replace the original array item with temp array item but in reverse
		// order
		for (int i = l, j = 0, k = 0; i <= r; i++) {

			if (j < rightArraySize) {
				a[i] = R[j];
				j++;
			} else {
				a[i] = L[k];
				k++;
			}
		}

	}

	private static void merge(int[] a, int l, int m, int r) {
		int leftArraySize = m - l + 1;
		int rightArraySize = r - m;
		int L[] = new int[leftArraySize];
		int R[] = new int[rightArraySize];

		// fill temp array with original array data
		for (int i = 0; i < leftArraySize; i++) {
			L[i] = a[l + i];
		}

		for (int i = 0; i < rightArraySize; i++) {
			R[i] = a[m + i + 1];
		}

		// fill the original array item with temp array item but sort in the
		// process of doing it

		int i = l, j = 0, k = 0;

		while (j < leftArraySize && k < rightArraySize) {
			if (L[j] < R[k]) {
				a[i] = L[j];
				j++;
			} else {
				a[i] = R[k];
				k++;
			}
			i++;
		}

		while (j < leftArraySize) {
			a[i] = L[j];
			j++;
			i++;
		}

		while (k < rightArraySize) {
			a[i] = R[k];
			k++;
			i++;
		}

	}

	private static void quickSort(int[] a, int l, int r) {
		if (l < r) {
			int pivotIndex = partition(a, l, r);
			quickSort(a, l, pivotIndex - 1);
			quickSort(a, pivotIndex + 1, r);
		}
	}

	private static int partition(int[] a, int l, int r) {
		int pivotIndex = (l - 1);
		int pivot = a[r];

		// compare all the items with pivot item
		// swap between items
		for (int j = l; j <= r; j++) {
			if (a[j] <= pivot) {
				pivotIndex++;
				swap(a, pivotIndex, j);
			}
		}
		// return the smallest item index as pivot index
		return pivotIndex;
	}

	// standard swap method
	private static void swap(int[] a, int pivotIndex, int j) {
		int temp = a[pivotIndex];
		a[pivotIndex] = a[j];
		a[j] = temp;
	}

	private static boolean compareArrays(int a[], int b[]) {
		if (a.length != b.length) {
			return false;
		} else {
			for (int i = 0; i <= a.length - 1; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
			return true;
		}
	}
}
