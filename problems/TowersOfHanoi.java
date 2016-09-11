package problems;

public class TowersOfHanoi {

	public static void main(String[] args) {
		towersOfHanoi(3, 1, 2, 3);

	}

	static void towersOfHanoi(int disks, int from, int to, int spare) {
		if (disks == 1) {
			// There is only one disk to be moved. Just move it.
			System.out.printf("Move disk 1 from stack %d to stack %d%n", from, to);
		} else {
			// Move all but one disk to the spare stack, then
			// move the bottom disk, then put all the other
			// disks on top of it.
			towersOfHanoi(disks - 1, from, spare, to);
			System.out.printf("Move disk %d from stack %d to stack %d%n", disks, from, to);
			towersOfHanoi(disks - 1, spare, to, from);
		}
	}

}
