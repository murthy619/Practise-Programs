package com.practise;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRank_Lexico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
	int n =sc.nextInt();
	int len =n;
	String[] words = new String[str.length()];
if(str.length()==len){
	for(int i=0;i<str.length();i++){
		String s = (String) str.subSequence(i, n);
		if(s.length() == len)
			words[i] = s;
		if(n!=str.length())
		n++;
	}

	clean(words);

Arrays.sort(words);

System.out.println(words[0]);
System.out.println(words[words.length-1]);
}
else
{
	System.out.println(str);
	System.out.println(str);
}
sc.close();}
	public static String[] clean(final String[] v) {
		  int r, w;
		  final int n = r = w = v.length;
		  while (r > 0) {
		    final String s = v[--r];
		    if (s!=null) {
		      v[--w] = s;
		    }
		  }
		  return Arrays.copyOfRange(v, w, n);
		}
}
