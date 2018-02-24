package com.facebook.toptenfreshers;

public class SumberWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={-15,1,2,4,3,7,11,15,};
		int target =0;
		
		sumOfThree(array, target);
		//System.out.println(str);
		
		
	}
	public static String sumoftwo(int[] array, int target)
	{
		String str="";
		int first=0;
		int second = array.length-1;
		int sum =0;
		while(first < second)
		{
			
			sum = array[first]+array[second];
			if(sum < target)
			{
				first = first+1;
			}
			else if(sum > target)
			{
				second = second -1;
			}
			else if(sum == target)
			{
				
				str= array[first] +"  "+array[second];
				break;
				
			}
		}
		
		
		return str;
	}
	
	public static void sumOfThree(int[] array, int target)
	{
		int sumof2Target =0;
		for(int i =0;i <array.length;i++)
		{
			sumof2Target = target - array[i];
			String str = sumoftwo(array, sumof2Target);
			System.out.println(str + " "+ array[i]);
			break;
		}
	}

}
