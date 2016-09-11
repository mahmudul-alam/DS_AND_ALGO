package problems;

public class CountPattern {

	public static void main(String[] args) {
		System.out.println(countPattern("HelloHelloHellolloHe", "llo", 0, 0));
	}

	private static int countPattern(String sentence, String pattern, int sentenceIndex, int patternIndex) {
		if (sentenceIndex < sentence.length()) {
			if (sentence.toCharArray()[sentenceIndex] == pattern.toCharArray()[patternIndex]) {
				if (patternIndex + 1 == pattern.length()) {
					return 1 + countPattern(sentence, pattern, ++sentenceIndex, 0);
				} else {
					return countPattern(sentence, pattern, ++sentenceIndex, ++patternIndex);
				}
			}else{
				return countPattern(sentence, pattern, ++sentenceIndex, 0);
			}
		} else {
			return 0;
		}
	}

}
