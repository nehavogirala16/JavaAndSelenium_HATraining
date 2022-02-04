package com.healthasyst.task4;

public class Student {
	// create student type
	// all the parameters should be declared as private
	// all the variables should be declared as non static except schoolname

	private String studentRollno;
	private String studentName;
	private String studentMailid;
	private double studentPercentage;
	private static String schoolName;

	public void printStudentDetails(Student std){
		System.out.println(this);
		System.out.println(studentRollno);
		System.out.println(studentName);
		System.out.println(studentMailid);
		System.out.println(studentPercentage);
		System.out.println(schoolName);
	}

	public static void main(String[] args) {

//create 3 different insatance for 3 different students and store the values
		Student.schoolName = "Global school";

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();

		std1.studentRollno = "M1001";
		std1.studentName = "jack";
		std1.studentMailid = "jack@gmail.com";
		std1.studentPercentage = 45.2;

		std2.studentRollno = "M1002";
		std2.studentName = "peter";
		std2.studentMailid = "peter@gmail.com";
		std2.studentPercentage = 85.2;

		std3.studentRollno = "M1003";
		std3.studentName = "mark";
		std3.studentMailid = "mark@gmail.com";
		std3.studentPercentage = 56.5;
		
		std1.printStudentDetails(std1);
		std2.printStudentDetails(std2);
		std3.printStudentDetails(std3);
		
	
	
	}

}
