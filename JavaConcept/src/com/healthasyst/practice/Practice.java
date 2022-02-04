package com.healthasyst.practice;

public class Practice {
 int a;
 String b;
 
 Practice(){
	 super();
	 System.out.println("constr1");
 }

public static void main(String[] args) {
	Practice var=new Practice();
	
	
	System.out.println("int type variable is   " +var.a);
	System.out.println("double type variable is   " +var.b);
}
}
   