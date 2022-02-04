package com.ha.groups;

import com.ha.base.Person;

public class Professor extends Person {
	private int professorId;
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public void printProfessorDetail()
	{
		System.out.println(super.getName());
		System.out.println(super.getPhoneNumber());
		System.out.println(this.getDepartmentName());

	}
}