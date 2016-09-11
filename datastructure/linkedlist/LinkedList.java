package datastructure.linkedlist;

public class LinkedList {
	
	public Node head;
	public Node tail;
	
	public LinkedList(){
		head = new Node("head");
		tail = head;
	}
	
	public void addNode(Node node){
		tail.next = node;
		tail = node;
	}
	
	public void printNodeText(){
		while(head != null){
			System.out.println(head);
			head = head.next;
		}
	}
}
