package algorithm.movecontent.array;

public class MoveArrayContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		moveArrayContent(ar, 4);
	}

	private static void moveArrayContent(int[] a, int num) {
		// TODO Auto-generated method stub
		int[] newArray = new int[a.length + num];

		for (int i = 0; i < num; i++) {
			int temp = 0;
			for (int j = 0; j < a.length - 1; j++) {
				temp = a[0];
				a[0] = a[j + 1];
				a[j + 1] = temp;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
