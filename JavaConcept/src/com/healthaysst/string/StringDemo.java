package com.healthaysst.string;

import com.healthasyst.task4.Student;

public class StringDemo {

	public static void main(String[] args) {
		
		int a=10;
		
		String color="red"; //immutable
		
		String color1="red";
		
		color1="black";
		
		color1="blue";
		
		String name=new String("apple");
		
		String color4="red";
		String color5=new String("red");
		
		
		System.out.println(color4);
		System.out.println(color5);
		
		
		System.out.println(color4==color5);
		System.out.println(color4.equals(color5));
		
		//Student stu=new Student("john");
		
		String c="red";
		int res=c.length();
		System.out.println(res==3);
		
		System.out.println(c.length());
		c=c+" hello";
		
		StringBuilder builder=new StringBuilder("red");
		
		System.out.println(builder.charAt(0));
		builder.append(" hello");
		
		System.out.println(builder);
		
		int numb=20;
		
		String z=String.valueOf(numb); //int to string
		System.out.println(z);
		
		int zz=Integer.parseInt(z);  //string to int
		System.out.println(zz+zz);

		
		
	}

}