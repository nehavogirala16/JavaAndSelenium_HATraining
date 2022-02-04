package com.healthasyst.practice;

public class Parameterized {
String name;
int age;

Parameterized(String name, int age){
	this.age=50;
	this.name="ritu";
	System.out.println("this is parameterized constructor");
}

 Parameterized() {
	super();
	System.out.println("This is non parameterized");
}
	
	public static void main(String[] args) {
		Parameterized p1 = new Parameterized("ravi",60);
		System.out.println(p1.age);
		System.out.println(p1.name);
		Parameterized p2 = new Parameterized();
		System.out.println(p2.age);
		System.out.println(p2.name);
	}
}
