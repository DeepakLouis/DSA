package trees;

import java.util.Scanner;

public class TreeImplementation {
	
	private Node root;
	
	private static class Node {
		int val;
		Node right;
		Node left;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	private void populate(Scanner sc) {
		System.out.println("Enter the root node");
		int val = sc.nextInt();
		root = new Node(val);
		populate(sc, root);
		
	}
	
	private void populate(Scanner sc, Node node) {
		System.out.println("Do you want to install to the left of " + node.val);
		boolean insertLeft = sc.nextBoolean();
		
		if(insertLeft) {
			System.out.println("Enter the left node");
			int val = sc.nextInt();
			
			node.left = new Node(val);
			populate(sc, node.left);
		}
		
		System.out.println("Do you want to install to the right of " + node.val);
		boolean insertRight = sc.nextBoolean();
		
		if(insertRight) {
			System.out.println("Enter the right node");
			int val = sc.nextInt();
			
			node.right = new Node(val);
			populate(sc, node.right);
		}
	}
	
	void display() {
		display(root);
	}
	
	void display(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.println(node.val);
		display(node.left);
		display(node.right);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeImplementation tree = new TreeImplementation();
		tree.populate(sc);
		
		tree.display();
		
	}
}
