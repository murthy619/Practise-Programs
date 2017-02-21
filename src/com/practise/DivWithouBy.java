package com.practise;

public class DivWithouBy {

	static double div(int a, int b){
		int s=1;
		double r=0;
		if(a<0){
			a=-a;
			s=-s;
		}
		if(b<0){
			b=-b;
			s=-s;
		}
		while(a>=0){
			a-=b;

			r++;
		}
		return (r-1)*s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(div(4,2));

	}

}
