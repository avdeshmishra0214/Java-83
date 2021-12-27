package co.edureka.ems;

import java.util.Scanner;

import co.edureka.ems.configs.ServiceFactory;
import co.edureka.ems.dto.Employee;
import co.edureka.ems.service.EmployeeService;

public class EMSApp {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		EmployeeService empservice = ServiceFactory.getEmployeeService();
		
		while(true) {
			System.out.println("1. Save Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Search Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. All Employees");
			System.out.println("6. Exit");
			
			System.out.println("-----------------------------------------------------------------");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				Employee emp = createEmployee();
				empservice.insertEmployee(emp);
				break;
			 case 2:
				break;
			 case 3:
				System.out.print("search employee with employee no: ");
				int eno = sc.nextInt();
				empservice.searchEmployee(eno);
				break;
			 case 4:
				System.out.print("delete employee with employee no: ");
				eno = sc.nextInt();
				empservice.deleteEmployee(eno);				 
				break;
			 case 5:
				empservice.getAllEmployees(); 
				break;
			 case 6:
				System.out.println("**** BYE **** BYE ****");
				System.exit(0);
				break;
			 default:
				System.out.println("**** INVALID OPTION **** TRY AGAIN ****"); 
				break;			
			}
			
			System.out.println("-----------------------------------------------------------------");
		}//while

	}

	private static Employee createEmployee() {
		System.out.print("enter employee no: ");
		int eno = sc.nextInt();
		
		System.out.print("enter employee name: ");
		String name = sc.next();
		
		System.out.print("enter employee salary: ");
		float sal = sc.nextFloat();
		
		return new Employee(eno, name, sal);
	}

}
