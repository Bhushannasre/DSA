package LinkedList;

public class Node{
	private String data;//DATA MEMBERS
	private Node next;//Node 
	
	public Node(String data) {
		this.data=data;//CONSTRUCTOR
		this.next=null;	
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
