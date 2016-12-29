package com.practise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRank_UsernameRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String username = in.nextLine();
	         String pattern ="^[a-zA-Z][_0-9a-zA-Z]*{7,29}$";
	        		 //"^[A-Za-z_]\\w{7,29}$";
	        		 //
	         Pattern r = Pattern.compile(pattern);
	         Matcher m = r.matcher(username);

	         if (m.find( ) && (username.length()>=8 && username.length()<=30) ) {
	            System.out.println("Valid");
	         } else {
	            System.out.println("Invalid");
	         }
	         testCases--;
	      }
	}

}
