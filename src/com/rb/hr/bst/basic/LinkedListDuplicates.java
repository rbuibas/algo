package com.rb.hr.bst.basic;

class NodeLinkedList {
	int data;
	NodeLinkedList next;

	NodeLinkedList(int d) {
		data = d;
		next = null;
	}

}

class LinkedListDuplicates {
	public static NodeLinkedList removeDuplicates(NodeLinkedList head) {

		if (head == null)
			return null;

		NodeLinkedList tHead = head;
		NodeLinkedList tHead2;
		while (tHead.next != null) {
			
			tHead2 = tHead;
			
			while(tHead2.next != null) {
				if (tHead.data == tHead2.next.data) {
					tHead2.next = tHead2.next.next;
				} else {
					tHead2 = tHead2.next;
				}
			}
			tHead = tHead.next;
		}
		return head;
	}

	public static NodeLinkedList insert(NodeLinkedList head, int data) {
		NodeLinkedList p = new NodeLinkedList(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			NodeLinkedList start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(NodeLinkedList head) {
		NodeLinkedList start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Integer[] intArray = { 1,1,1,1,1,1,4};
		NodeLinkedList root = null;
		for (Integer anIntArray : intArray) {
			root = insert(root, anIntArray);
		}
		root = removeDuplicates(root);
		display(root);

	}
}