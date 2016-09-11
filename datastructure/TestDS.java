package datastructure;

import datastructure.linkedlist.Node;
import datastructure.list.MyList;

public class TestDS {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		MyList<Integer> integerList = new MyList<>();
		
		integerList.add(1);
		integerList.add(2);
		integerList.add(null);
		
		
		System.out.println(integerList.get(1));
		System.out.println(integerList.indexOf(null));
		
		MyList<String> stringList = new MyList<>();
		
		stringList.add("Hello");
		stringList.add("World");
		
		
		System.out.println(stringList.get(1));
		
		
		MyList<Node> customClassList = new MyList<>();
		
		Node n1 = new Node("Node 1");
		customClassList.add(n1);
		Node n2 = new Node("Node 2");
		customClassList.add(n2);
		System.out.println(customClassList.get(1));
		
		@SuppressWarnings("rawtypes")
		MyList withoutParam = new MyList();
		
		withoutParam.add("string");
		withoutParam.add("string2");
		
		
		System.out.println(withoutParam.get(1));
	}

}
