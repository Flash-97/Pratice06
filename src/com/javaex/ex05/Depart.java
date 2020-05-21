package com.javaex.ex05;

public class Depart extends Employee{

	 //코드작성

	private String department;

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void showInformation() {
		System.out.println("이름:" + name + ", " + "연봉:" + salary + ", " + "부서:" + department);
	}
	
	
	@Override
	public String toString() {
		return "Depart [department=" + department + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}
	
	
	
	
	
	
	
	
}
