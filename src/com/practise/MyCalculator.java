package com.practise;

import java.util.Scanner;

public class MyCalculator{

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		try{
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			sc.close();
			MyCalculator mc = new MyCalculator();
			if(n1<0 || n2<0){

			throw mc.new PowerException();
			}
			else{
			int res = (int) Math.pow(n1, n2);
			System.out.println(res);
			}
		}
		catch(PowerException ex){
			System.out.println(ex.getClass().getName()+": n and p should be non-negative");
		}
	}

	public class PowerException extends Exception {

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		PowerException(){
		}
}
}
