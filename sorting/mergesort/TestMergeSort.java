package sorting.mergesort;

public class TestMergeSort {
	public static void main(String s[]) {
		int[] a = {38, 27, 43, 3, 9, 82, 10 };
		System.out.println("Before Merge Sort: ");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		mergeSort(a, 0, a.length - 1);
		System.out.println("After Merge Sort: ");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		if('C'<'D'){
			System.out.println("smaller");
		}else{
			System.out.println("bigger");
		}
		
		
	}

	private static void mergeSort(int[] a, int l, int r) {
		if (l < r) {
			int m = (l+r)/2;
			mergeSort(a, l, m);
			mergeSort(a, m+1, r);
			merge(a, l, m , r);
		}
	}

	private static void merge(int[] a, int l, int m, int r) {

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

	}

}
