package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*
 * Input [cat, rat, act, tac, tar, silent]
 * Output [[cat, act, tac] [rat, tar] [silent]]
 */

public class AnagramProblem {

	private String word = "Hello";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnagramProblem problem = new AnagramProblem();
		
		List<String> wordList = new ArrayList<String>();
		wordList.add("cat");
		wordList.add("rat");
		wordList.add("act");
		wordList.add("tac");
		wordList.add("tar");
		wordList.add("silent");
		
		ListIterator<String> iter = wordList.listIterator();
		while(iter.hasNext()){
			System.out.println(problem.generateHasCode(iter.next()));
		}

	}
	
	
	private int generateHasCode (String word){
		
		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		int hashCode = charArray.toString().hashCode();
		int sumOfAscii = 0;
		for(int i=0; i<charArray.length; i++){
			sumOfAscii += charArray[i];
		}
		return sumOfAscii;
	}


	@Override
	public int hashCode() {
		
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

}
