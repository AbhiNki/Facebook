package com.facebook.toptenfreshers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeListsAlternateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(7);
		List<Integer> b = new ArrayList<Integer>();
		b.add(4);
		b.add(5);
		b.add(3);
		List<Integer> c = new ArrayList<Integer>();
		for(int i=0;i<a.size();i++)
		{
			c.add(a.get(i));
			if(i<b.size())
				c.add(b.get(i));
		}
		System.out.println(c);

	}

}
