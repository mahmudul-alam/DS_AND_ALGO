package problems;

/*
 * Given a string, compute recursively (no loops) 
 * the number of lowercase 'x' chars in the string. 
 * 
 * countX("xxhixx") → 4
 * countX("xhixhix") → 3
 * countX("hi") → 0
 */

public class CountX {

	public static void main(String[] args) {
		System.out.println(countX("xxxxxxX", 0));
	}

	private static int countX(String character, int index) {
		if (index == character.toCharArray().length - 1) {
			if (character.toCharArray()[index] == 'x') {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (character.toCharArray()[index] == 'x') {
				return 1 + countX(character, index + 1);
			} else
				return 0 + countX(character, index + 1);
		}
	}
}
