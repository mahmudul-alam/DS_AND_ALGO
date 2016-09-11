package problems;

public class RemoveX {

	public static void main(String[] args) {
		System.out.println(removeX("xshXixhaxbx"));
		System.out.println(reverseString("bahihs"));

	}

	private static String removeX(String string) {
		if (string.length() != 0) {
			if (string.charAt(0) != 'x') {
				return String.valueOf(string.charAt(0)).concat(removeX(string.substring(1)));
			} else {
				return removeX(string.substring(1));
			}
		} else {
			return "";
		}
	}

	private static String reverseString(String string) {
		if (string.length() != 0) {
			return String.valueOf(string.charAt(string.length() - 1))
					.concat(reverseString(string.substring(0, string.length() - 1)));
		} else {
			return "";
		}
	}

}
