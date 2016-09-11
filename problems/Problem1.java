package problems;

import java.util.Random;

import datastructure.list.List;
import datastructure.list.MyList;

/*
 * Write a subroutine that creates an ArrayList containing several 
 * different random integers in the range from 1 up to some specified maximum. 
 * The number of integers and the maximum allowed value for the integers 
 * should be parameters to the subroutine. 
 * Write a main() routine to test your subroutine.
 */

public class Problem1 {

	public static void main(String[] args) {

		System.out.println(createArrayListContainingRandomNumbers(5, 6));
	}

	/*
	 * 
	 */
	public static List<Integer> createArrayListContainingRandomNumbers(int numberOfItems, int maxNumber) {

		if (numberOfItems > maxNumber) {
			throw new IllegalArgumentException();
		}

		List<Integer> list = new MyList<>(numberOfItems);
		for (int i = 0; i < numberOfItems; i++) {
			int newNumber;
			// check to see if this number already exist. if it doesn't then add
			// the number
			do {
				newNumber = new Random().nextInt(maxNumber);
			} while (list.indexOf(newNumber) != -1);
			
			list.add(newNumber);
		}
		return list;

	}

}
