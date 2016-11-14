package algorithm.reversestring;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = new String("A man A Plan! nalpa nama");
		
		String str = "ABCD";
		
		/*
		 * char[] ch = str.toCharArray(); int i = 0, j = ch.length - 1; int k =
		 * 0; for (;;) { char temp = ch[i]; ch[i] = ch[j]; ch[j] = temp; i++;
		 * j--; k++; if (i > j || i == j) break; } System.out.println(ch);
		 * System.out.println(k);
		 */
		String newString = str.replaceAll("[^a-zA-Z]", "");
		//System.out.println(reverseRecursively(str));
		String reverseString = reverseRecursively(newString);
		System.out.println(reverseString);
		
		if(newString.equalsIgnoreCase(reverseString)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}
		
		
	}

	public static String reverseRecursively(String str) {

		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}

}
