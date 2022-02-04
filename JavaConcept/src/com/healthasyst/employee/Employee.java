package com.healthasyst.employee;

public class Employee {
	//all are non static
public int empId;
public String empName;
public double empSal;
public static String empCompName;


//printempdetails
//public static void printEmpDetails(int no) {
	//System.out.println(no);
//}

/*static way ------
  public static void printEmpDetails(Employee emp) {
	System.out.println(emp.empId);
	System.out.println(emp.empName);
	System.out.println(emp.empSal);
	System.out.println(Employee.empCompName);
	
}
*/

public void printEmpDetails(Employee emp) {
	System.out.println(this);
	System.out.println(empId);
	System.out.println(empName);
	System.out.println(empSal);
	System.out.println(Employee.empCompName);
}
}