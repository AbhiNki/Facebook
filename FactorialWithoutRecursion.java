package com.facebook.toptenfreshers;

import java.util.Scanner;

public class FactorialWithoutRecursion {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int input = sc.nextInt();
		int fact=1;
		for(int i=input; i> 0;i--)
		{
		  fact*=i;
		}
		System.out.println("factorial of "+input+ " = "+fact);
	}

}
