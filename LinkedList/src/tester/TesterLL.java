package tester;

import LinkedList.LL;
public class TesterLL {

	public static void main(String[] args) {
		LL list=new LL();
		
		list.addLast("1");
		list.addLast("2");
		list.addLast("3");
		list.addLast("4");
		list.printList();
	//	list.removeFirst();
		//list.printList();
		//list.removeLast();
		//list.printList();
	  // System.out.println(list.getsize());
	  // list.addMiddle(2,0,"is");
	   //  System.out.println(list);
       list.reverseIterate();
       list.printList();

	}
	

}
