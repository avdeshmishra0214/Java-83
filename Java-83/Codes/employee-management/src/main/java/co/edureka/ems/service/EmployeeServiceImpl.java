package co.edureka.ems.service;

import java.util.List;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.dao.EmployeeDaoImpl;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao;
	
	public EmployeeServiceImpl() throws Exception{
		if(dao == null)
			dao = new EmployeeDaoImpl(); 
	}
	
	public void insertEmployee(Employee emp) throws Exception {
		Integer n = dao.saveEmployee(emp);
		if(n > 0)
			System.out.println("Employee Saved");
	}

	public void modifyEmployee(Employee emp) throws Exception {
		Integer n = dao.updateEmployee(emp);
		if(n > 0)
			System.out.println("Employee Updated");
	}

	public void deleteEmployee(Integer eno) throws Exception {
		Integer n = dao.deleteEmployee(eno);
		if(n > 0)
			System.out.println("Employee Deleted");
		else
			System.out.println("No Matching Employee with EMPNO="+eno + " in List");
			
	}

	public void searchEmployee(Integer eno) throws Exception {
		Employee emp = dao.findEmployeeByNo(eno);
		if(emp != null)
			System.out.println(emp);
		else
			System.out.println("No Matching Employee with EMPNO="+eno + " in List");
	}

	public void getAllEmployees() throws Exception {
		List<Employee> emps = dao.findAll();
		for(Employee emp : emps) {
			System.out.println(emp);
			Thread.sleep(1000);
		}
	}

}
