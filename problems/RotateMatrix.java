package problems;

/*
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees. Canyou do this in place?
 * 
 * For Example 
 * 
 * INPUT
 * 	1  2  3  4
 *  5  6  7  8
 *  9 10 11 12
 *  13 14 15 16
 *  
 *  OUTPUT
 *  
 *  13  9  5  1
 *  14  10  6  2
 *  15  11  7  3
 *  16  12  8  4
 */

public class RotateMatrix {

	public static void main(String[] args) {

		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] matrix2 = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
		RotateMatrix rotateMatrix = new RotateMatrix();
		rotateMatrix.rotateMatrix90Degree(matrix2);
		System.out.println("");

	}

	/*
	 * (pivot, first) -> (first, last) top to right 
	 * (first, last) -> (last, last - first + pivot) right to bottom 
	 * (last, last - first + pivot) -> (last-first + pivot, pivot) bottom to left 
	 * (last-first + pivot, pivot) -> (pivot, first) left to top
	 */
	private void rotateMatrix90Degree(int[][] matrix) {
		for (int i = 0; i < matrix.length / 2; i++) {
			int pivot = i;
			int temp = 0, temp2 = 0;

			int last = matrix.length - 1 - i;
			for (int j = i; j < last; j++) {
				int first = j;

				// take top to temp
				temp = matrix[pivot][first];

				// move left to top
				matrix[pivot][first] = matrix[last - first + pivot][pivot];
				// move bottom to left
				matrix[last - first + pivot][pivot] = matrix[last][last - first + pivot];
				// move right to bottom
				matrix[last][last - first + pivot] = matrix[first][last];
				// move top to right 
				matrix[first][last] = temp; 

			}
		}
	}

}
