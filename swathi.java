package com.practise;

import java.util.StringTokenizer;

public class swathi {

	public static void main(String[] args) {


		String str = "Java is a Java Program";
		int count =  0;
		StringTokenizer st = new StringTokenizer(str," ");

		while(st.hasMoreElements()){
			System.out.println("1"+st.nextElement());
			Object word1= st.nextElement();
			System.out.println("2"+word1+" "+count);
			while (st.hasMoreTokens()){
							if(word1.equals(st.nextToken())){
								count++;
								System.out.println("3"+word1+" "+st.nextToken());
							}
							else{
								System.out.println("3"+word1+" "+st.nextToken());
							}
			}
			System.out.println("4"+word1+" "+count);
		}

	}

}
