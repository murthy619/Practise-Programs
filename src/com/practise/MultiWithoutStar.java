package com.practise;

public class MultiWithoutStar {


	static int  mul(int a, int b){
		int c=0;
		for(int i=0;i<b;i++){
			c=c+a;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(mul(2,3));

	}

}
