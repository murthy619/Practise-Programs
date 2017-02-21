package com.practise;

public class ExceptionHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try{
			int c = 2/0;
		}
		catch(Exception e){
		System.out.println("in catch");
		}
		finally{
	System.out.println("in finally");
	    }
		System.out.println("in main");
}

}
