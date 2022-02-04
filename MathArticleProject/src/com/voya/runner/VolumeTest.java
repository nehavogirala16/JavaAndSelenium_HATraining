package com.voya.runner;

import com.HA.volume.Volume;

public class VolumeTest {

	public static void main(String[] args) {
		
		
	   Volume v1    =new Volume();
	   double volumeres=v1.volumeOfSphere(15.5);
	   System.out.println(volumeres);

	   Volume v2=new Volume();
	   double volumeCuboid=v2.volumeOfCuboid(20.5, 65.2, 20);
	   System.out.println(volumeCuboid);
	   
	}

}
