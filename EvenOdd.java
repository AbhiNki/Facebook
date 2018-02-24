package com.facebook.toptenfreshers;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input%2==0)
		{
			System.out.println("even");
		}
		else
			System.out.println("odd");
		sc.close();
	}

}
