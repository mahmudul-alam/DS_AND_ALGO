package sorting.mergesort;

public class TestMergeSort {
	@SuppressWarnings("unused")
	public static void main(String s[]) {
		int[] a = { 3, 9, 2, 5, 7, 10, 19, 15, 1, 10 };
		System.out.println("Before Merge Sort: ");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		int[] countInversion = {0};
		mergeSort(a, 0, a.length - 1, countInversion);
		System.out.println("After Merge Sort: ");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		System.out.println("Number of Inversion: " + countInversion[0]);
		if ('C' < 'D') {
			System.out.println("smaller");
		} else {
			System.out.println("bigger");
		}

	}

	private static void mergeSort(int[] a, int l, int r, int[] countInversion) {

		//Integer countInversion = 0;
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(a, l, m, countInversion);
			mergeSort(a, m + 1, r, countInversion);
			merge(a, l, m, r, countInversion);
		}
		//return countInversion;
	}

	private static void merge(int[] a, int l, int m, int r, int[] countInversion) {

		int n1 = m - l + 1;
		int n2 = r - m;

		// create two temp arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		// populate temp arrays with data from the original array
		for (int i = 0; i < n1; i++) {
			L[i] = a[l + i];
		}

		for (int j = 0; j < n2; j++) {
			R[j] = a[m + 1 + j];
		}

		// compare the temp arrays and put the sorted data in the original array
		// loop condition should be something that both temp array has data to
		// compare

		int i = 0, j = 0, k = l;

		while (i < n1 && j < n2) {
			if (L[i] < R[j]) {
				a[k] = L[i];
				i++;
			} else {
				// count the number of inversion
				countInversion[0] = countInversion[0] + (L.length - i);
				a[k] = R[j];
				j++;
			}
			k++;
		}

		// means we have sorted data left in Left Array L
		while (i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}

		// means we have sorted data left in Right Array R
		while (j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}

		//return countInversion;

	}

}
