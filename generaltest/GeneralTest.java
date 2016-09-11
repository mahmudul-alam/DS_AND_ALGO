package generaltest;

import java.util.Hashtable;

public class GeneralTest {

	public static void main(String[] args) {
		
		// test division
		System.out.println(3/2);
		
		// test modular
		// modular gives is reminder
		System.out.println(17%9);
		
		Hashtable<String, String> table = new Hashtable<>();
		
		table.put("94704", "add1");
		table.put("94704", "add2");
		table.put("94705", "add3");
		
		table.get("94704");
		
		
	}

}
