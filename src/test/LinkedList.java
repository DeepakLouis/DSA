package test;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
	
	private static NodeClass head;
	
	public static void main(String[] args) {
		
		head = new NodeClass(1);
		head.setNext(new NodeClass(2));
		
		NodeClass first = head.getNext();
		first.setNext(new NodeClass(3));
		
		NodeClass second = first.getNext();
		second.setNext(head);
		
		System.out.println(detectLoopInLinkedList());
		
	}
	
	static boolean detectLoopInLinkedList() {
		
//		Set<NodeClass> storeNodes = new HashSet<>();
//		
//		while(head != null) {
//			
//			if(storeNodes.contains(head)) {
//				return true;
//			}
//			
//			storeNodes.add(head);
//			head = head.getNext();
//		}
//		
//		return false;
		
		NodeClass tempNode = new NodeClass(-1);
		
		while(head != null) {
			System.out.println(head.getValue());
			NodeClass next = head.getNext();
			
			if(next == tempNode) {
				return true;
			}
			
			if(next == null) {
				return false;
			}
			
			head.setNext(tempNode);
			head = next;
		}
		
		return false;
	}
	
}

class NodeClass {
	private int value;
	private NodeClass next;
	
	public NodeClass(int value) {
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
//	public void setVisited(boolean visited) {
//		
//	}
//	
//	public boolean getVisited() {
//		
//	}
	
	public void setNext(NodeClass next) {
		this.next = next;
	}
	
	public NodeClass getNext() {
		return next;
	}
	
	
}
