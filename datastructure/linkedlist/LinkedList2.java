package datastructure.linkedlist;

public class LinkedList2 {

	public Node head;
	public Node pointer;

	public LinkedList2() {

	}

	public void addNode(Node node) {

		if (head == null) {
			head = node;
		} else {
			pointer.next = node;
		}
		pointer = node;
	}

	public void printNodeText() {
		if(head == null){
			System.out.println("Empty Linked List");
			return;
		}else{
			Node marker = head;
			while (marker != null) {
				System.out.println(marker);
				marker = marker.next;
			}
		}
		
	}
}
