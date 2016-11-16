package com.practise;

public class StringReverse {

	public static void main(String[] args) {
String name = "This is Java";
StringBuilder sb = new StringBuilder(name);
	sb.reverse();

String[] str = name.split(" ");
StringBuilder sb1 = new StringBuilder();
for(String s1:str){
sb = new StringBuilder(s1);
String s2 = sb.reverse().toString();
sb1.append(" ");
sb1.append(s2);

}

System.out.println(sb1);
}

}
