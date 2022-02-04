package com.healthasyst.methods;

public class MethodsDemo {
//area of circle
	//public static double areaOfCircle(int r) {
	//	double area = 3.14 * r * r;
		//return area;
	//}
//area of trianle
	//public static double areaOfTriangle(double b, double h) {
		//double areaT = (b * h) / 2;
		//return areaT;
	//}

	public static void main(String[] args) {
		
		// static method
		// accessmodifies statis returntyme methodname(arguments)

		//int r = 10;
		double res = Area.areaOfCircle(10);
		System.out.println(res);
		
		//int b=2,c=3;
		//double res1= MethodsDemo.areaOfTriangle(2, 3);
		//System.out.println(res1);
		//(OR)
	System.out.println(Area.areaOfTriangle(25.0, 1));
	double random = Math.random();
	System.out.println(random);
	}

}
