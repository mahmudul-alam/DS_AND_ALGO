package sorting.insertionsort;

public class TestInsertionSort {
	public static void main(String s[]) {
		int arr[] = { 12, 11, 13, 5, 6 };
		System.out.println("Before Insertion Sort: ");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		performInsertion(arr);
		System.out.println("After Insertion Sort: ");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	private static int[] performInsertion(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int keyElement = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > keyElement) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = keyElement;
		}
		return arr;
	}
}
