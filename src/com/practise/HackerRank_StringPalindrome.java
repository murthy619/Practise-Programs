package com.practise;

import java.util.Scanner;

public class HackerRank_StringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(!str.isEmpty()){
			StringBuffer sb = new StringBuffer(str);
			if(sb.reverse().toString().equals(str)){
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
		sc.close();

	}

}
