package com.pratap.bean;

public class Employee {
	
	private int empId;
	private String name;
	private String state;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, String state) {
		super();
		this.empId = empId;
		this.name = name;
		this.state = state;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", state=" + state + "]";
	}
	

}
