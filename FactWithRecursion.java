package com.facebook.toptenfreshers;

import java.util.Scanner;

public class FactWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int input = sc.nextInt();
		int result = recursiveFact(input);
		System.out.println("factorial of "+input+ " = "+result);
	}
	public static int recursiveFact(int input)
	{
		if(input==1)
			return 1;
		
		int result=0;
		result = recursiveFact(input-1)*input;
		
		return result;
	}

}
