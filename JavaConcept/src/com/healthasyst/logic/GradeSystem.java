package com.healthasyst.logic;

public class GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 59;
		if (mark >= 90) {
			System.out.println("A");
		} else if (mark >= 80 && mark < 90) {
			System.out.println("B");
		} else if (mark >= 60 && mark < 80) {
			System.out.println("C");
		} else if (mark < 60 && mark > 0) {
			System.out.println("D");

		}
	}

}
