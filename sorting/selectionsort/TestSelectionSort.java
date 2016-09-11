package sorting.selectionsort;

public class TestSelectionSort {
	
	public static void main(String s[]){
		int[] a= { 9, 12, 3, 6, 1, 0, 18};
		System.out.println("Before Selection Sort: ");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		performSelectionSort(a);
		System.out.println("After Selection Sort: ");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
	
	private static int[] performSelectionSort(int[] a){
		for(int i = 0; i<a.length; i++){
			int min_idx = i;
			
			for(int j = i+1; j<a.length; j++){
				if(a[min_idx]>a[j]){
					min_idx = j;
				}
			}
			swap(a, min_idx, i);
		}
		return a;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;	
	}

}
