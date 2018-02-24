package com.facebook.toptenfreshers;

import java.util.Arrays;

public class MinAbsoluteValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array ={1,4,8,20,40,90};
		Arrays.sort(array);
		int minAbsVal = array[1]-array[0];
		for(int i =2;i<array.length;i++)
		{
			minAbsVal = Math.min(minAbsVal, array[i]-array[i-1]);
		}
		System.out.println(minAbsVal);

	}

}
