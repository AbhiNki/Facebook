package com.facebook.toptenfreshers;

public class Point implements Comparable<Point> {
	int x;
	int y;
	int z;
	public Point(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getDist(){
		return x*x+y*y+z*z;
	}
	
	/*public int compareTo(Point obj) {
		int c = Integer.compare(getDist(),obj.getDist());
		if(c == 0){
			c = Integer.compare(x, obj.x);
			if(c==0){
				c = Integer.compare(y, obj.y);
			}
		}
		return c;
	}*/
	public void printData()
	{
		System.out.print("[x: "+ this.x+" , "+"y: "+ this.y+" , "+"z: "+ this.z+"]");
	}

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		return 0;
	}
}