package StackArray;

import java.util.Scanner;

public class Demo {
	Scanner sc=new Scanner(System.in);
	int top=-1;
	int n=10;
	int a[]=new int[n];
	public void push() {
		if(top==(n-1)) {
			System.out.println("overflow");
		}
		else {
			System.out.println("Enter data");
			int i=sc.nextInt();
			top=top+1;
			a[top]=i;
			System.out.println("item inserted");
		}}
		public void pop() {
			if(top==-1) {
				System.out.println("Underflow");	
			}
			else {
				top=top-1;
				System.out.println("item deleted");
				
			}}
			public void display() {
				System.out.println("item are");
				for(int j=top;j>=0;j--) {
					System.out.println(a[j]);
					
				}
				
			}
		
	

	public static void main(String[] args) {
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

	

