package com.facebook.toptenfreshers;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array ={1,2,3,4,5,6,7,85,67,22};
		int key = 85;
		int first =0;
		int last =array.length-1;
		int mid =(first+last)/2;
		int i;
		Arrays.sort(array);
		
		for(i =0;i<array.length;i++)
		{
			
			if(key > array[mid])
			{
				first =mid+1;
			}
			else if(key < array[mid])
			{
				last = mid-1;
			}
			else
			{
				System.out.println(key +" at "+ mid);
				break;
			}
			
				mid = first+last/2;
			
		}
		if(i==array.length)
		{
			System.out.println(key+" not found!");
		}
		
	}

}
