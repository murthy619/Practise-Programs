package com.practise;

import java.util.Scanner;

public class HackerRank_Exception {

	public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int result=0;
        try{
        	int num1 = Integer.valueOf(sc.nextLine());
            int num2 = Integer.valueOf(sc.nextLine());
            result = num1/num2;
            System.out.println(result);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
        }
        catch(Exception ex){
            System.out.println(ex.getClass().getName());
        }
        sc.close();
	}

}
