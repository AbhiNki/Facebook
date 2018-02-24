package com.facebook.toptenfreshers;

public class SquareRootDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num = 16;
		double t;
		double squareroot =num /2;
		
		do{
			t =squareroot;
			squareroot=(t+(num/t))/2;
		} while((t - squareroot)!=0);
		
		
		System.out.println(squareroot);

	}

}
