import java.util.*;
import java.io.*;
import java.lang.*;

public class pairWiseSwap{
	Node head;
	class Node{
		int data;
		Node link;
		Node(int d){
				data =d;
				link =null;
			}
		}
	public  void push(int newData){
		Node newNode = new Node(newData);
		newNode.link=head;
		head=newNode;
		}

	public  void printList(){
		Node temp=head;
		System.out.print(temp.data);
		temp=temp.link;
		while(temp != null)
		{
			System.out.print("-->" + temp.data);
			temp=temp.link;
		}
			System.out.println();
		}
	public void swap(){
		Node temp=head;
		while(temp != null && temp.link != null){
			int k = temp.data;
			temp.data = temp.link.data;
			temp.link.data = k;
			temp=temp.link.link;
		}
	}

	public static void main(String args[]){
		pairWiseSwap list = new pairWiseSwap();
		list.push(40);
		list.push(30);
		list.push(20);
		list.push(10);
		System.out.println("Linked List before swapping:");
		list.printList();
		System.out.println("Linked List after swapping:");
		list.swap();
list.printList();
		}

}
