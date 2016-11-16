package com.practise;

public class IntegertoString {

	public static void main(String[] args) {
String word = "28";
String changed = null;
int count = 0, num = 11;
try{
 count = Integer.valueOf(word);
 changed = String.valueOf(num);
}
catch(NumberFormatException e){
	System.out.println(e.getMessage());
}
System.out.println(count);
System.out.println(changed);


	}

}
