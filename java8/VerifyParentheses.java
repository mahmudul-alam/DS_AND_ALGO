package java8;

public class VerifyParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerifyParentheses verify = new VerifyParentheses();
		if (verify.verify("Hello ([{]])")) {
			System.out.println("This text verifies the parantheses compliance");
		} else {
			System.out.println("this text doesn't verify");
		}

	}

	private boolean verify(String text) {

		text = text.replaceAll("[^(){}\\[\\]]", "");
		char[] charArray = text.toCharArray();

		int j = 0;

		if (charArray.length % 2 != 0) {
			return false;
		}
		for (int i = (charArray.length / 2) - 1; i >= 0; i--) {
			char firstItem = charArray[i];
			char lastItem = charArray[charArray.length / 2 + j++];

			if ((firstItem == '(' && lastItem != ')') || (firstItem == '{' && lastItem != '}')
					|| (firstItem == '[' && lastItem != ']')) {
				return false;
			}
		}
		return true;
	}

}
