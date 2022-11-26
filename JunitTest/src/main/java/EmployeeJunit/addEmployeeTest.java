package EmployeeJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.pratap.bean.Employee;
import com.pratap.service.EmpService;
import com.pratap.service.EmpServiceIMPL;

public class addEmployeeTest {
	
	EmpService es = new EmpServiceIMPL();
	
	@Test
	public void testAddEmployee() {
		
		Employee emp = new Employee();
		
		int id = 1;
		String name = "ank"; 
		String state = "bihar";
		
		emp=new Employee(id,name,state);
		
		es.addEmployee(emp);
		
		assertEquals(1, emp.getEmpId());
		
		
	}

}
