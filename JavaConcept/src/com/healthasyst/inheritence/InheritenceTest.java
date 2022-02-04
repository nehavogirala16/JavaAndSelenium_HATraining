package com.healthasyst.inheritence;

class Parent{
	public int PAge=50;
	public void parentStyle() {
		System.out.println("parent style");
		
	}
	
}

//to have parents feature in child you can recreate the method
//recreating is not encouraged in programming
/*class Child{
	
	public void parentStyle() {
		System.out.println("parent style");
		
	}
	
	public void childStyle() {
		System.out.println("child style");
	}
	
}
*/

//instead of recreating you can use extends keyword for reusing method

class Child extends Parent{
	public int CAge=10;
	public void parentStyle() {
		System.out.println("parent style");
		
	}
	
	public void childStyle() {
		System.out.println("child style");
	}
	
}

public class InheritenceTest {

	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		System.out.println(c.PAge);
		System.out.println(c.CAge);
		c.childStyle();
		c.parentStyle();
		
		
		

	}

}
