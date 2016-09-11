package algorithm.reversewordinsentence;

public class ReverseWordInSentence {
	public static void main(String s[]) {
		System.out.println(reverse("this is mahmudul alam"));
		
//		System.out.println("Man Bites Dog".indexOf(" "));
//		System.out.println("Man Bites Dog".substring(0, "Man Bites Dog".indexOf(" ")));
//		System.out.println("Man Bites Dog".substring("Man Bites Dog".indexOf(" ") + 1));
	}

	private static String reverse(String s) {
		if (!s.contains(" ")) {
			return s;
		}
		
		return reverse(s.substring(s.indexOf(" ") + 1)) + " " + s.substring(0, s.indexOf(" "));
		
		
	}

}
