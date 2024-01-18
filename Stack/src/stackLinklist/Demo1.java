package stackLinklist;

import java.util.Scanner;

import StackArray.Demo;

public class Demo1 {
	static class Node {
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	Node top=null;
	 void push(Scanner sc) {
		 System.out.println("Enter data");
		 int data=sc.nextInt();
		 Node newNode=new Node(data);
		if(top==null) {
		
		 top=newNode;
		}
		else {
			newNode.next=top;  
		     top=newNode;
		}
	 }
	 void pop() {
		 if(top==null) {
		 System.out.println("Stack is empty");
		 }
		 else {
			 top=top.next;
		 }
	 }
	 void display() {
		 Node temp=top;
		 while(temp!=null){
			 
		 }
		 System.out.println(temp.data);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p ;
		Scanner sc=new Scanner(System.in) ;
		Demo j1=new Demo();
		int k;
	
		
		do {
			System.out.println("Press 1 to push");
			System.out.println("press 2 to Pop");
			System.out.println("press 3 to display");
			System.out.println("Enter your choice");
			k=sc.nextInt();
			switch(k) {
			case 1:
			{
				j1.push();
				break;
			}
			case 2: 
			{
				j1.pop();
				break;
			}
			case 3:
				j1.display();
				break;
				
			}
			System.out.println("Enter 0 To Go Back to the Main Menu");
			System.out.println("Enter any key to EXIST");
			p=sc.nextInt();
		}
			while(p==0);
			System.out.println("EXIST Successfully");
			sc.close();
		}
		
	

	}


