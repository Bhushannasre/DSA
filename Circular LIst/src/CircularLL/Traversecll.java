package CircularLL;

import java.util.Scanner;

public class Traversecll {
	Scanner sc=new Scanner(System.in) ;

	public class Node{
		public int data;
		public Node next;
		public Node(int data) {
			this.data = data;
			this.next=null;
		}
		
	
	}
	Node head=null;
	public void Creeation() {
		int data,n,m,p;
		System.out.println("ENTER VALUE");
		data=sc.nextInt();
	
		do {
			System.out.println("Enter data");
			data=sc.nextInt();
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
			}
			else {
				System.out.println("1.Enter at Begininng 2.Enter at last");
				n=sc.nextInt();
				switch(n) {
				case 1:
					newNode.next=head;
					head=newNode;
					break;
				case 2:
					Node lastNode=head;
					while(lastNode!=null) {
						lastNode=lastNode.next;
						lastNode.next=newNode;
						head=newNode;
						break;
					}
					
					
				}
			}
		}
		while(head==null); {
			System.out.println("Could not add data");
			
		}
		}
	public void Traverser() {
		Node temp1=head;
		if(head==null) {
			System.out.println("LL does not exist");
		}
		else {
			do {
				
				System.out.println(temp1.data+" ");
				temp1=temp1.next;
			}
			while(temp1!=head);
			
		}
	}
	public void printList() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode=head;
		while(currNode!=null) {
		    System.out.print(currNode.data + "->");	
			currNode=currNode.next;
		}
		System.out.println();
	}
	
		


}
	
 
		
	

	
