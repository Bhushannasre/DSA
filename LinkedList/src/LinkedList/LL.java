package LinkedList;


public class LL {
	private int size;
	private Node head;
	
	public LL() {
		this.head=null;
	}
	public void addFirst(String data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		//head=newNode;
		newNode.setNext(head);
		head=newNode;

	}
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return ;
			
		}
		Node lastNode=head;
		while(lastNode.getNext()!=null) {
			lastNode=lastNode.getNext();
			
			
		}
		lastNode.setNext(newNode);
	}
	
	
	public void printList() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode=head;
		while(currNode!=null) {
		    System.out.print(currNode.getData() + "->");	
			currNode=currNode.getNext();
		}
		System.out.println();
	}
	
	public void removeFirst() {
	if(head==null) {
		System.out.println("Empty list is empty,Nothing to delete");
	  return ;
	}
	head=head.getNext();
	size--;
}
	public void removeLast() {
		if(head==null) {
			System.out.println("Empty list Nothing to delete");
			return ;

		}
		size--;
		if(head.getNext()==null) {
			head=null;
			return;
		}
		Node currNode=head;
		Node lastNode=head.getNext();
		while(lastNode.getNext()!=null) {
			currNode=currNode.getNext();
		    lastNode=lastNode.getNext();
		}
		currNode.setNext(null);
	}
	public int getsize() {
		return size;
	}
	
	//adding Node in middle of Linked List
	public void addMiddle(int index,int size, String data) {
		if(index>size||size<0) {
			System.out.println("Invalid Index Value");
			return ;
		}
		Node newNode=new Node(data);
			if(head==null||index==0) {
			      newNode.getNext();
				head=newNode;
			}
			 Node currNode = head;
		       for(int i=1; i<size; i++) {
		           if(i == index) {
		               Node nextNode = currNode.getNext();
		               currNode.setNext(newNode);
		               newNode.setNext(nextNode);
		               break;
		           }
		           currNode = currNode.getNext();
		       }

	}
	public void reverseIterate() {
		if(head==null||head.getNext()==null) {
			return ;
		}
		Node prevNode=head.getNext();
		Node currNode=head.getNext();
		while(currNode!=null) {
			Node nextNode=currNode.getNext();
			currNode.setNext(prevNode);
			prevNode=currNode;
			currNode=nextNode;
		}
		head.setNext(null);
		head=prevNode;
		
		return ;
	}
	
	
}
