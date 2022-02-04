package com.healthasyst.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee emp1=new Employee();
	    Employee emp2=new Employee();
		Employee emp3=new Employee();

		
        //without initializing anything variables give default values
		//System.out.println(emp1.empId);//gives default value 0
		//System.out.println(emp1.empCompName);//gives default value null
		
		//if something is constant for all- you can make it statis
		//here you can make companyname as contant
		Employee.empCompName="HA";
		
		emp1.empId=101;
		emp1.empName="john";
		emp1.empSal=6000;
		//emp1.empCompName="HA";
		
		
		emp2.empId=102;
		emp2.empName="peter";
		emp2.empSal=2000;
		
		
		emp3.empId=103;
		emp3.empName="mark";
		emp3.empSal=4000;
		//emp2.empCompName="HA";
		
		
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.empSal);
		System.out.println(Employee.empCompName);
		
		//System.out.println(emp1);
		
		//Employee.printEmpDetails(101);
		
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(emp2.empSal);
		System.out.println(Employee.empCompName);
		
		/*static way of calling
		Employee.printEmpDetails(emp1);//static
		Employee.printEmpDetails(emp2);//static
		Employee.printEmpDetails(emp3);//static
	}
	*/
		
		emp1.printEmpDetails(emp1);
		emp2.printEmpDetails(emp2);
		emp3.printEmpDetails(emp3);
		
	}
	
	}
