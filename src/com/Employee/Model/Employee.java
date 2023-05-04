package com.Employee.Model;

public class Employee {
	
	 int EmpID;
	
	 String EMPName;
	
	 String EMPDept;
	
	 int Salary;

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		this.EmpID = empID;
	}

	public String getEMPName() {
		return EMPName;
	}

	public void setEMPName(String eMPName) {
		this.EMPName = eMPName;
	}

	public String getEMPDept() {
		return EMPDept;
	}

	public void setEMPDept(String eMPDept) {
		this.EMPDept = eMPDept;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", EMPName=" + EMPName + ", EMPDept=" + EMPDept + ", Salary=" + Salary
				+ "]";
	}

	
}
