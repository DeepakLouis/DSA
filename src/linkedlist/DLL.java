package linkedlist;

public class DLL {
	
	private Node head;
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		
		if(head != null) {
			head.prev = node;
		}
			
		head = node;
	}
	
	public void display() {
		System.out.print("START -> ");
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		
		System.out.println("END");
		
	}
	
	public void insertLast(int val) {
		Node node = new Node(val);
		
		Node last = head;
		if(last == null) {
			head = node;
			return;
		}
		
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = node;
		node.prev = last;
	}
	
	public void find(int val) {
		
	}
	

	private class Node {
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val = val;		}
	}
	
	public static void main(String[] args) {
		DLL list = new DLL();
		list.insertLast(1);
		
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        
        list.insertLast(18);
        
        list.display();
	}
}
