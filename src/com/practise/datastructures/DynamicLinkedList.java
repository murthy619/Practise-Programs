package com.practise.datastructures;

import java.util.Scanner;



class DNode{
	String data;
	DNode link;
	DNode(){
		this.link = null;
		this.data = null;
	}
}

public class DynamicLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DNode a = new DNode();
		DNode b = a;

		System.out.println("Enter the String1 \n");
		a.data = sc.nextLine();
		while(true){
			System.out.println("Enter Y to continue and N to stop Linked List \n");
			char ch = sc.next().charAt(0);
			if(ch == 'N' || ch == 'n' ){
				break;
			}
				//DNode c = new DNode();

				a.link = new DNode();
				System.out.println("Enter data \n");
				a.link.data = sc.nextLine();
				a = a.link;
		}
		a=b;
		sc.close();
		while(a!=null){
		System.out.println(a.data);
		a=a.link;
		}
	}

}
