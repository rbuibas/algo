package app;

class Node {
	private String id;
	private Node next = null;
	
	public Node(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

public class AlgoLinkedList {
	private Node head;
	
	public AlgoLinkedList() {
		this.head = new Node("head");
	}
	
	public Node getHead() {
		return this.head;
	}
	
	public Node addFront(Node node) {
		node.setNext(head);
		head = node;
		return head;
	}
	
	public Node addBack(Node node) {
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(node);
		return node;
	}
	
	public void printAll() {
		Node current = head;
		int perLine = 13;
		while (current.getNext() != null) {
			System.out.print(current.getId() + "-> ");
			current = current.getNext();
			if (--perLine == 0) {
				System.out.println();
				perLine = 13;
			}
		}
		System.out.println("NULL");
	}
	
	public boolean isLLCircular() {
		Node fast = head, slow = head;
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
}
