package com.practise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HackerRank_StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		StringTokenizer st = new StringTokenizer(s,"[ ,!,?._'@]+");
		int count = st.countTokens();
		System.out.println(count);
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
		scan.close();
	}

}
