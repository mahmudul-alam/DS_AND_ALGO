package sorting.quicksort;

import java.util.Arrays;

public class TestQuickSort {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(performQuickSort(ar, 0));

	}

	private static int[] performQuickSort(int[] ar, int pivotIndex) {

		while (true) {
			if (ar.length < 3) {
				if (ar[0] > ar[1]) {
					int temp = ar[0];
					ar[0] = ar[1];
					ar[1] = temp;
				}
				break;
				
			}
			int pivot = ar[0];
			int left = 1;
			int right = ar.length - 1;

			while (left < right) {

				while (pivot > ar[left]) {
					left = left + 1;
					if(left == ar.length)
						break;
				}

				while (pivot < ar[right]) {
					if(left == right){
						break;
					}
					right = right - 1;
					
				}

				// swap left and right
				if (left < right) {
					int temp = ar[left];
					ar[left] = ar[right];
					ar[right] = temp;
				}

			}

			// swap pivot and left-1
			ar[0] = ar[left - 1];
			ar[left - 1] = pivot;
			int splitPoint = left - 1;
			if (splitPoint > 0) {
				performQuickSort(Arrays.copyOfRange(ar, 0, splitPoint - 1), 0);
			}

			if (splitPoint < ar.length) {
				//performQuickSort(Arrays.copyOfRange(ar, splitPoint + 1, ar.length));
			}
		}
		return ar;
	}

}
