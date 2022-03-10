package com.emp.details;

public class Varman extends EmployeeDetails{
	public void empID() {
		System.out.println("Emp ID is H001234");
	}
	public static void main(String[] args) {
		EmployeeDetails H = new EmployeeDetails();
		Employee Emp = new Employee();
		Keerthi K = new Keerthi();
		Varman V = new Varman();
		H.empName();
		H.empAge();
		Emp.empNumber();
		K.empSalary();
		V.empID();
		
	}
}
