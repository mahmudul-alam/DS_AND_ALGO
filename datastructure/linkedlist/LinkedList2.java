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
		if (head == null) {
			System.out.println("Empty Linked List");
			return;
		} else {
			Node marker = head;
			while (marker != null) {
				System.out.println(marker);
				marker = marker.next;
			}
		}

	}

	public void reverseLinkedList() {
		Node previous = null;
		Node current = head;
		Node next;
		if (head == null) {
			throw new RuntimeException("Cannot reverse empty linked lise");
		}else if(head.next == null){
			return;
		}
		
		next = head.next;

		while (next != null) {
			current.next = previous;
			previous = current;
			current = next;
			next = current.next;
		}
		
		current.next = previous;
		head = current;

	}
}
