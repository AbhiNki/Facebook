package com.facebook.toptenfreshers;

import java.util.Collections;
import java.util.PriorityQueue;

public class DistanceIn3DSpace {

	public static void main(String[] args) {
		Point point1 = new Point(1,1,1);
		Point point5 = new Point(3,4,2);
		Point point2 = new Point(2,3,3);
		Point point3 = new Point(2,5,4);
		Point point4 = new Point(2,4,1);
		
		int k=3;
		Point[] p ={point5, point1, point2, point3, point4};
		
		for(Point pnt: p)
		{
			pnt.printData();
		}
		Point[] result =getClosestK(p, k);
		
		System.out.println();
		
		for(Point pp:result)
		{
			pp.printData();
		}
	}
	public static Point[] getClosestK(Point[]arr,int k){
		PriorityQueue<Point> pq = new PriorityQueue <>(k,Collections.reverseOrder());
		for(int i=0; i<arr.length; i++){
			if(pq.size()<k){
				pq.offer(arr[i]);
			}else if(arr[i].getDist()<pq.peek().getDist()){
				pq.remove();
				pq.offer(arr[i]);
			}
		}
		return pq.toArray(new Point[k]);
	}
}