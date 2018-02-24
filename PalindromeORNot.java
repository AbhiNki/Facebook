package com.facebook.toptenfreshers;

import java.util.Scanner;

public class PalindromeORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word to check palindrome!");
		String str =sc.nextLine();
		String reverse ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		if(reverse.equals(str))
		{
			System.out.println("Entered String is palindrome");
		}
		else
			System.out.println("given String is not palindrome!");
	}

}
