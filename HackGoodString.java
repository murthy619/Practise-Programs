package com.practise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class HackGoodString {
	public static void main(String args[] ) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	 LinkedHashSet<String> sorted = new LinkedHashSet<String>();
    	int num = sc.nextInt();
    	String goodStr = "";
    String[] strInput = new String[num];
    for(int i=0;i<num;i++){
    	strInput[i] = sc.next();
    	char[] c = strInput[i].toCharArray();
    	 for(int j=0;j<c.length;j++){
    		 sorted.add(String.valueOf(c[j]));
    }
    }
    for(String s: sorted){
		 goodStr+= s;
	 }
    System.out.println(goodStr);
    	sc.close();
}
}
