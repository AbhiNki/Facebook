package com.facebook.toptenfreshers;

public class RemoveNumberFrmArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={1,3,4,52,26,2,5,2,7,2,8,3};
		int i =0;
		int targetremove =2;
		for(int j=0;j<array.length;j++)
		{
			if(array[j]!=targetremove)
			{
				array[i++]=array[j];
			}
		}
		System.out.println("length of new array ="+i);

	}

}
