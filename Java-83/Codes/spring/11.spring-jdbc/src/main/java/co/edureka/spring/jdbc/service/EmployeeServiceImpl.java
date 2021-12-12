package co.edureka.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.spring.jdbc.dao.EmployeeDao;
import co.edureka.spring.jdbc.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public void insertEmployee(Employee emp) {
		Integer n = dao.saveEmployee(emp);
		if(n > 0)
			System.out.println("Employee Saved");
	}

	public void modifyEmployee(Employee emp) {
		Integer n = dao.updateEmployee(emp);
		if(n > 0)
			System.out.println("Employee Updated");
	}

	public void deleteEmployee(Integer eno) {
		Integer n = dao.deleteEmployee(eno);
		if(n > 0)
			System.out.println("Employee Deleted");
		else
			System.out.println("No Matching Employee with EMPNO="+eno + " in List");
	}

	public void searchEmployee(Integer eno) {
		Employee emp = dao.findEmployeeByNo(eno);
		System.out.println(emp);
	}

	public void getAllEmployees() {
		List<Employee> emps = dao.findAll();
		for(Employee emp : emps) {
			System.out.println(emp);
		}
	}

}
