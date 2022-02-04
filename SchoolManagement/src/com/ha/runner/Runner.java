package com.ha.runner;

import com.ha.groups.Professor;
import com.ha.groups.Student;

public class Runner {

	public static void main(String[] args) {

		Student stu1=new Student();
		stu1.setName("John wick");
		stu1.setPhoneNumber(9898986565L);
		stu1.setStudentId(101);
		stu1.setStudentPercentage(66.3);

		Student stu2=new Student();
		stu2.setName("Dina");
		stu2.setPhoneNumber(8898986565L);
		stu2.setStudentId(102);
		stu2.setStudentPercentage(45.2);

		stu1.printStudentDetail();
		stu2.printStudentDetail();


		stu2.provideCertification();
		stu1.provideCertification();

		Professor p1=new Professor();
		p1.setName("Kevin");
		p1.setPhoneNumber(7899998888L);
		p1.setDepartmentName("DP101");

		p1.printProfessorDetail();

	}
}