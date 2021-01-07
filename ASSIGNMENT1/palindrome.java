import java.util.*;
import java.io.*;
import java.lang.*;

public class palindrome{
	Node head;						
	class Node{
		char data;
		Node next;
		Node(char c)
		{
			data=c;
			next=null;
		}
	}
	public void push(char new_data){
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void printList(){
		Node temp=head;
		System.out.print(temp.data);
		temp = temp.next;
		while(temp != null){
			System.out.print("-->" + temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	public boolean isPalin(){
		Node temp=head;
		Node temp2 = head;
		boolean flag = true;
		char t;
		Stack <Character> st = new Stack <Character>();
		while (temp != null)
		{
			st.push(temp.data);
			temp=temp.next;
		}
		//System.out.print(st);
		while(temp2 != null){
			t = st.pop();
			if ( t == temp2.data){
				temp2=temp2.next;
			}
			else {
				flag = false;
				return flag;
				}
		}
		return flag;
		}

	public static void main(String args[]){
		boolean res;
		palindrome list = new palindrome();
		list.push('E');
		list.push('V');
		list.push('E');
		list.printList();
		res = list.isPalin();
		if (res == true )
			System.out.println( " Above given linked list is palindrome");
		else 
			System.out.println( " Above given linked list is not  palindrome");

		palindrome list2 = new palindrome();
		list2.push('Y');
		list2.push('A');
		list2.push('D');
		list2.printList();
		res = list2.isPalin();
		if (res == true )
			System.out.println( " Above given linked list is palindrome");
		else 
			System.out.println( " Above given linked list is not  palindrome");
	}
	}
