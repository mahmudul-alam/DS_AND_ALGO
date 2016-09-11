package algorithm.fibonacci;

public class TestFibonacci {
	public static void main(String... args){
		int sum = 0;
		System.out.println(getFibonacci(3));
	}

	private static int getFibonacci(int i) {
		// TODO Auto-generated method stub
		if(i>2){
			return getFibonacci(i-2) + getFibonacci(i-1);
		}
		return 1;
	}
}
