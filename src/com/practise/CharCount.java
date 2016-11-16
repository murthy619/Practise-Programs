package com.practise;

public class CharCount {

	public static void main(String[] args) {
String name = "This is a ajava program";
int count = name.length()-name.replace("a", "").length();
System.out.println(count);
	}

}
