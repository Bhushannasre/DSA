package CircularLL;
import java.util.Scanner;
public class Circular {
	
	 
	public void creation() {
		
	
		 
	
		Scanner sc=new Scanner(System.in);
		Node tail;
		 Node head;
		 Node temp1;
		
		int m,n,data,p;
		
		do {
			System.out.println("Enter Number");
			data=sc.nextInt();
			Node newNode=new Node(data);
				if(head==null) {
					head=newNode;
					tail=newNode;
					newNode.setNext(head);
					
			
				}
	
				else {
					
					System.out.println("1. To insert at the beginning .2 To insert at the end .3 To insert at specific ");
					m=sc.nextInt();
					switch(m) 
					{
					case 1:
					newNode.setNext(head);
					head=newNode;
					tail.setNext(head);
					break;
				case 2:
					
				tail.setNext(newNode);	
				tail=newNode;
				newNode.setNext(head);
					break;
				case 3:
					System.out.println("Enter the position of Node to be inserted");
				   p=sc.nextInt();
				   Node temp1=head;
				   for(int i=0;i<(p-1);i++) {
					   temp1=temp1.getNext();
				   }
				   newNode.setNext(temp1.getNext());
				   temp1.setNext(newNode);
				   
					
					}
					System.out.println("Do you want to add more data");
					n=sc.nextInt();
					}
		}
				while(n==1); 
					
				
				
		}
}
					
				
		
			
			
		
	
	
	
	


