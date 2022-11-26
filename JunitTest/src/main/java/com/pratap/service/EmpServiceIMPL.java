package com.pratap.service;

import java.util.LinkedList;
import java.util.List;

import com.pratap.bean.Employee;

public class EmpServiceIMPL implements EmpService{
	
	
	LinkedList<Employee> list;
	
	public EmpServiceIMPL()
    {
        list = new LinkedList<>();
    }

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		if(!find(employee.getEmpId())) {
			list.add(employee);
		}else {
 
            // Print statement
            System.out.println(
                "Record already exists");
        }
		return null;
	}

	private boolean find(int empId) {
		// TODO Auto-generated method stub
		
		for(Employee e : list) {
			
			if(e.getEmpId() == empId) {
				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		Employee emp = null;
		
		for(Employee e : list) {
			
			if(e.getEmpId() == empId) {
				emp=e;
			}
			
		}
		
		if(emp == null) {
			return flag;
		}else {
			list.remove(emp);
			flag=true;
		}
		return flag;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		if(list.isEmpty()) {
			System.out.println("The list has no records\n");
		}
		
		for(Employee e : list) {
			System.out.println(e.toString());
		}
		
		return null;
	}

	@Override
	public Employee get(int empId) {
		// TODO Auto-generated method stub
		
		for(Employee e : list) {
			if(e.getEmpId() == empId) {
				return e;
			}
		}
		
		return null;
	}

}
