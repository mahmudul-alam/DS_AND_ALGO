package sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 9, 5, 8, 4, 1, 3, 7, 8, 9 };
		buubleSort(a);
	}

	private static void buubleSort(int a[]) {
		System.out.println("Unsorted Array: " + Arrays.toString(a));
		int k = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - (i + 1); j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				System.out.println(i + " " + j + " " + Arrays.toString(a));
				k++;
			}
		}
		System.out.println("Total iteration " + k);
	}

}
