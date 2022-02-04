package com.healthasyst.methods;
//area of circle
public class Area {
	public static double areaOfCircle(int r) {
		double area = 3.14 * r * r;
		return area;
	}
//area of trianle
	public static double areaOfTriangle(double b, int h) {
		double areaT = (b * h) / 2;
		return areaT;
	}	
//area of rectangle
		public static double areaOfRectangle(double l, double b) {
			double areaR= l*b;
			return areaR;
		}
		
		
}
