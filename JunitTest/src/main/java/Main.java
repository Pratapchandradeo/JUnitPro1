import java.util.Scanner;

import com.pratap.bean.Employee;
import com.pratap.service.EmpService;
import com.pratap.service.EmpServiceIMPL;

public class Main {
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		EmpService es = new EmpServiceIMPL();
		
		Scanner sc = new Scanner(System.in);
		
		//for add employee
		
		
		 System.out.print("What is the Employee id Number ? ");
		 
		 int emId = sc.nextInt();
		 
		 System.out.print("What is the Employee Name ? ");
		 
		 String na = sc.next();
		 
		 System.out.print("What is the Employee State ? ");
		 
		 String stt = sc.next();
		 
		 em=new Employee(emId,na,stt);
		 es.addEmployee(em);
		 
		 System.out.println(em.toString());
		 
		 
	}

}
