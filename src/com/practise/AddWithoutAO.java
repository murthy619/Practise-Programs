package com.practise;

public class AddWithoutAO {


	static int Add(int a, int b){

		if(b == 0) return a;
		else
		return Add((a^b),(a&b)<<1);
	}

	public static void main(String[] args) {

	System.out.println(Add(1,2));


}

}
