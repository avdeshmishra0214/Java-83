package co.edureka.spring.jdbc.service;

import co.edureka.spring.jdbc.entity.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);
	
	void modifyEmployee(Employee emp);
	
	void deleteEmployee(Integer eno);
	
	void searchEmployee(Integer eno);
	
	void getAllEmployees();
}
