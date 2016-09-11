package problems;

import java.util.Arrays;

/*
 * Suppose that M is a two-dimensional array that has R rows and C columns. 
 * The transpose of M is defined to be an array T that has C rows and R columns such that 
 * T[i][j] = M[j][i] for each i and j. Write a function that takes an array of type int[][] as a parameter, 
 * and returns the transpose of that array. 
 * (Assume that the parameter is a typical 2D array in which all the rows have the same length.) 
 * Also write a subroutine to print a 2D array of integers in neat rows and columns, 
 * and include a main() routine to test your work.
 */

public class Problem2 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println("Initial Array:");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(Arrays.toString(a[i]));
		}
		
		System.out.println();
		
		int[][] t = transpose(a);
		System.out.println("Transpose Array:");
		for (int i = 0; i < t.length; i++) {
			System.out.print(Arrays.toString(t[i]));
		}
	}

	private static int[][] transpose(int a[][]) {

		int numOfRow = a.length;
		int numOfColumn = a[0].length;

		int[][] t = new int[numOfColumn][numOfRow];

		for (int i = 0; i < numOfColumn; i++) {
			for (int j = 0; j < numOfRow; j++) {
				t[i][j] = a[j][i];
			}
		}
		return t;
	}

}
