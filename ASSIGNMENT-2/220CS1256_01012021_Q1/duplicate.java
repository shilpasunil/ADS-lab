import java.io.*;
import java.lang.*;
import java.util.*;

public class duplicate{
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

	public void remove() {
        	node ptr1 =null, ptr2 = null, dup = null;
       		ptr1 = head;
       	 	while (ptr1 != null && ptr1.next != null) {
           		 ptr2 = ptr1;
           		 while (ptr2.next != null) {
                		if (ptr1.data == ptr2.next.data) {
                    			dup = ptr2.next;
                    			ptr2.next = ptr2.next.next;
                    		} else {
                   			 ptr2 = ptr2.next;
                			}
            			}
            		ptr1 = ptr1.next;
        	}
    	}

	public static void main(String args[]){
		duplicate list = new duplicate();
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of nodes in linked list");
		int numOfNodes = sc.nextInt();
		System.out.println("Nodes in linked list");
		for(int i=0;i<numOfNodes;i++){
			list.InsertAtBeginning(sc.nextInt()) ;
		}
		System.out.println("LinkedLIst Initialy:Before removing duplicates");
		list.printList();
		list.remove();
		System.out.println("LinkedLIst After removing duplicates");
		list.printList();
		}
	}
