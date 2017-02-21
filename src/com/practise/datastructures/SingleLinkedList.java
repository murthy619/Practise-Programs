package com.practise.datastructures;

import java.util.Scanner;



class Node{
	String data;
	Node link;
	Node(){
		this.link = null;
		this.data = null;
	}
}

public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Node a = new Node();
		Node b = new Node();
		Node c = new Node();

		System.out.println("Enter the String1 ");
		a.data = sc.nextLine();
		a.link = b;

		System.out.println("Enter the String2 ");
		b.data = sc.nextLine();
		b.link = c;

		System.out.println("Enter the String3 ");
		c.data = sc.nextLine();
		c.link = null;

		sc.close();

		System.out.println(a.data);
	}

}
