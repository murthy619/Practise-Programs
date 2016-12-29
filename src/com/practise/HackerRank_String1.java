package com.practise;

import java.util.Scanner;


public class HackerRank_String1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Strings \n");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		int len = s1.length()+s2.length();
		int letter1 = s1.charAt(0);
		int letter2 = s2.charAt(0);
		System.out.println(len);
		if(letter1 > letter2){
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		System.out.println(CapitalizeEach(s1));
		System.out.println(CapitalizeEach(s2));
		sc.close();

	}
	public static String CapitalizeEach(String str){
		 return Character.toUpperCase(str.charAt(0)) + str.substring(1);
		}

}
