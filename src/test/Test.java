package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
	
	Node head;
	
	public Test(Node head) {
		this.head = head;
	}
	
	public void add(int value) {
		Node temp = new Node(value);
		Node headTemp = head;
		while(headTemp.getNode() != null) {
			headTemp = headTemp.getNode();
		}
		
		headTemp.setNode(temp); 
	}
	
	public int get(int index) throws Exception {
		Node headTemp = head;
		int count = 0;
		while(headTemp != null) {
			if(index == count) {
				return headTemp.getValue();
			}
			++count;
		}
		
		throw new Exception("Index out of bound");
	}
	
	public static void main(String[] args) {
	
	}
}

class Node {
	private int value;
	private Node node;
	
	public Node(int value) {
		this.value = value;
		this.node = null;
	}
	
	public Node(int value, Node node) {
		this.value = value;
		this.node = node;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public Node getNode() {
		return this.node;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setNode(Node node) {
		this.node = node;
	}
}
