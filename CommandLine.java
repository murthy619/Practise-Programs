package com.practise;

import java.util.Scanner;

public class CommandLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String name = sc.next();
		System.out.println("Enter the salary ");
		int salary = sc.nextInt();
		System.out.println(name+" earns "+salary+" dollars per month");
		sc.close();

	}

}
