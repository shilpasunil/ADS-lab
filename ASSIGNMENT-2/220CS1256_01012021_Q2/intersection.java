import java.io.*;
import java.lang.*;
import java.util.*;

public class intersection{
       node head;
       class node{
		int data;
		node next;
		node(int d){
			data=d;
			next=null;
		}
	}

	public  void InsertAtBeginning(int newData){
		node newNode = new node(newData);
		newNode.next=head;
		head=newNode;
		}

	public  void printList(){
		node temp=head;
		System.out.print(temp.data);
		temp=temp.next;
		while(temp != null)
		{
			System.out.print("-->" + temp.data);
			temp=temp.next;
		}
			System.out.println();
		}

	//traverse the list with minimum size such that each element is compared with the other list
	public void Intersection(node head1, node head2) 
    	{  
       		 node t1 = head1; 
       		 while (t1 != null) { 
           		 if (isPresent(head2, t1.data)) 
               			 InsertAtBeginning(t1.data); 
            			 t1 = t1.next; 
        	} 
   	} 
	
	boolean isPresent(node head, int data) 
    	{ 
      		  node t = head; 
        	  while (t != null) { 
          	  if (t.data == data) 
              		  return true; 
           	  t = t.next; 
        	  } 
       		 return false; 
    	} 
  

	public static void main(String args[]){
		intersection list1 = new intersection();
		intersection list2 = new intersection();
		intersection res = new intersection();

		Scanner sc = new Scanner(System.in);

		System.out.print("Number of nodes in linked list-1: ");
		int numOfNodes1 = sc.nextInt();

		System.out.print("Number of nodes in linked list-2: ");
		int numOfNodes2 = sc.nextInt();

		System.out.println("Nodes in linked list-1 ");
		for(int i=0;i<numOfNodes1;i++){
			list1.InsertAtBeginning(sc.nextInt()) ;
		}

		System.out.println("Nodes in linked list-2 ");
		for(int i=0;i<numOfNodes2;i++){
			list2.InsertAtBeginning(sc.nextInt()) ;
		}
		if (numOfNodes1 > numOfNodes2){
			res.Intersection(list2.head, list1.head); 
		}else{res.Intersection(list1.head, list2.head);}

		System.out.print("List-1: ");
		list1.printList();
		System.out.print("List-2: ");
		list2.printList();
		System.out.println("Intersection between list-1 and list-2");
		res.printList();
		}
	}
