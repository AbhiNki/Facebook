package com.facebook.toptenfreshers;

import java.util.Scanner;

public class ArmstronORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum =0;
		int rem =0;
		int div = input;
		while (div !=0)
		{
			rem = div%10;
			div = div/10;
			sum = sum+rem*rem*rem;
		}
		
		if(sum==input)
		{
			System.out.println("input no is armstrong!");
		}
		else
			System.out.println("Inuput no is not an armstrong!");

	}

}
