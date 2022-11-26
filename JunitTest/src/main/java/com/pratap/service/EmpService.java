package com.pratap.service;

import java.util.List;

import com.pratap.bean.Employee;

public interface EmpService {
	
	public Employee addEmployee(Employee employee);
	
	public boolean deleteEmployee(int empId);
	
	public List<Employee> getAllEmployees();
	
	public Employee get(int empId);

}
