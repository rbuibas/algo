package com.rb.hr.bst.basic;

import java.util.*;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BST_traversal {
	static void levelOrder(Node root) {

		Queue<Node> treeQ = new LinkedList<Node>();
		
		treeQ.add(root);
		
		while(!treeQ.isEmpty())
		{
			Node n = treeQ.remove();
			System.out.print(n.data);
			
			if (n.left != null)
				treeQ.add(n.left);
			if (n.right != null)
				treeQ.add(n.right);
		}
		
		treeQ.forEach(item->System.out.print(item.data));
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Integer[] intArray = {3,5,4,7,2,1};
		Node root = null;
		for (int i = 0; i < intArray.length; i++) {
			root = insert(root, intArray[i]);
		}
		levelOrder(root);
	}
}
