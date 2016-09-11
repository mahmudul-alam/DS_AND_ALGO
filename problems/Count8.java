package problems;

/*
 * Given a non-negative int n, compute recursively (no loops) 
 * the count of the occurrences of 8 as a digit, 
 * except that an 8 with another 8 immediately to its left counts double, 
 * so 8818 yields 4. Note that mod (%) by 10 yields 
 * the rightmost digit (126 % 10 is 6), while divide (/) by 10 
 * removes the rightmost digit (126 / 10 is 12). 
 * 
 * count8(8) → 1
 * count8(818) → 2
 * count8(8818) → 4
 */


public class Count8 {

	public static void main(String[] args) {
		System.out.println(count8(188188));
	}

	private static int count8(int number) {
		if (number <= 9 && number == 8)
			return 1;
		else if(number<=9){
			return 0;
		}
		else {
			if (number % 100 == 88) {
				return 2 + count8(number/10);
			}else if(number%10 == 8){
				return 1+ count8(number/10);
			}else{
				return count8(number/10);
			}
		}
	}
}
