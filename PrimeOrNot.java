  package com.facebook.toptenfreshers;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if its prime or not!");
		int input = sc.nextInt();
		int i;
		for(i =2;i< 10;i++)
		{
			if(input%i==0 &&input!=i)
			{
				break;
			}
		}
		if(i==10)
		{
			System.out.println("the given number "+input+" is Prime!");
		}
		else
		{
			System.out.println(input+" not a prime!");
		}
     

	}

}
