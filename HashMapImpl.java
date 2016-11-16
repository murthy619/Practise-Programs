package com.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapImpl {
	static Scanner sc = new Scanner(System.in);
	static Map<Integer, String> hm = new HashMap<Integer, String>();

	public static void main(String[] args) {
		hm.put(1, "Java");
		hm.put(2, ".Net");
		hm.put(3, "COBOL");
		hm.put(4, "JS");
		callValue();
	}
	public static void callValue(){
		System.out.println("Enter a key to display your Programming Language ");
		int select = sc.nextInt();
		displayValue(select);
	}
	public static void displayValue(int key){
		for(Entry<?, ?> m: hm.entrySet()){
				show(m,key);
				break;
		}
	}
	public static void show(Entry<?, ?> l, int key) {
		if(l.getKey().equals(key)){
			System.out.println(l.getValue());
		}
		else
		{
			System.out.println("Oopss....!! choose again ");
			callValue();
		}

	}

}
