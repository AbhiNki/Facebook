package com.facebook.toptenfreshers;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		int y =sc.nextInt();
		
		System.out.println("before Swapping: x =" +x +" y= "+y);
		
		x= x+y;
		y= x-y;
		x= x-y;
		
		System.out.println("after swapping: x =" +x+" y= "+y);

	}

}
