package com.facebook.toptenfreshers;

public class Palindrome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDCBAA";
		if(str.equals(new StringBuilder(str).reverse().toString()))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");

	}

}
