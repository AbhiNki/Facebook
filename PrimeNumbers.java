package com.facebook.toptenfreshers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range begining");
		int start =sc.nextInt();
		System.out.println("Enter the range ending");
		int end = sc.nextInt();
		ArrayList<Integer> array =new ArrayList<Integer>();
		for(int i=start;i<=end;i++)
		{
			int j;
			for(j=2;j<10;j++)
			{
				if(i%j==0 && j!=i)
				{
					break;
				}
				
			}
			if(j==10)
				array.add(i);
			
		}
		System.out.println("All prime Numbers are"+Arrays.asList(array));
	}

}
