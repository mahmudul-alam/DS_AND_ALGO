package datastructure.linkedlist;

public class LinkedListTest {

	public static void main(String... args){
		LinkedList2 list = new LinkedList2();
		list.addNode(new Node("First Node"));
		list.addNode(new Node("Second Node"));
		list.addNode(new Node("Third Node"));
		list.addNode(new Node("Fourth Node"));
		
		list.printNodeText();
	}
}
