package com.facebook.toptenfreshers;

import java.util.Random;

public class RandomNumberGen {

	public static void main(String[] args) {
		Random rand =new Random();
		int start = 1;
		int end = 10;
		int[] exclude = {2,5,6};
		
		int result = genRandom(rand, start, end, exclude);
		System.out.println(result);
	}
	
	public static int genRandom(Random rand, int start, int end, int[] exclude)
	{
		int random = start + rand.nextInt(end-start+1-exclude.length);
		for(int ex: exclude)
		{
			if(random < ex)
			{
				break;
			}
			random++;
		}
		return random;
		
	}

}
