package com.practise;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 */
//imports for BufferedReader
//import for Scanner and other utility  classes
import java.util.Scanner;


class HackStrReverse {
	public static void main(String args[] ) throws Exception {
    	Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String[] strInput = new String[num];
    StringBuffer sbReverse;
    for(int i=0;i<num;i++){
    	strInput[i] = sc.next();
    }

    	for(int j=0;j<strInput.length;j++){
    		sbReverse = new StringBuffer(strInput[j]);
    		//sb.append(sbReverse.reverse());
    		System.out.println(sbReverse.reverse());
    	}
    sc.close();

    }
}
