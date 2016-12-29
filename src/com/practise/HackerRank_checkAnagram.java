package com.practise;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRank_checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char[] c1;
		char[] c2;
		if(!str1.isEmpty() && !str2.isEmpty()
				&& (str1.length() == str2.length()))
					{
					c1 = str1.toLowerCase().toCharArray();
					 Arrays.sort(c1);
					c2 = str2.toLowerCase().toCharArray();
					Arrays.sort(c2);
					if(Arrays.equals(c1, c2)){
						System.out.println("Anagrams");
					}
					else
						System.out.println("Not Anagrams");
				}
		else
			System.out.println("Not Anagrams");
		sc.close();

	}

}
