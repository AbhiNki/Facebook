package com.facebook.toptenfreshers;

import java.util.Scanner;

public class FloyedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a range");
		int range = sc.nextInt();
		int n=0;
		for(int i=range;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(++n+" ");
			}
			System.out.println();
		}

	}

}
