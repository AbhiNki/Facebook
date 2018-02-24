package com.facebook.toptenfreshers;

public class PalindromeORNot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDCBA";
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
					{
				System.out.println("Not a Palindrome");
				break;
			}
			else
				if(i==str.length()/2-1)
					System.out.println("Its a palindrome");
				
		}

	}

}
