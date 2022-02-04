package com.HA.volume;

public class Volume {

	public double volumeOfSphere(double r) {
		//v= 4/3 * pi * r^3
		double VS=(4/3)*3.14*r*r*r;
		return VS;
	}
	
	public double volumeOfCylinder(double r,double h) {
		//v= pi * r^2 * h
		double VC= 3.14*r*r*h;
		return VC;
		
	}
	
	public double volumeOfCuboid(double w,double h,double l) {
		//v=w*h*l
		double VCU=w*h*l;
		return VCU;
		
	}
	
	public double volumeOfCone(double r,double h) {
		//v=pi * r^2 * (h/3)
		double vCone=3.14 * r* r * (h/3);
		return vCone;
	}
}
