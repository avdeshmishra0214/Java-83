package co.edureka.ems.service;

import co.edureka.ems.dto.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp) throws Exception;
	
	void modifyEmployee(Employee emp) throws Exception;
	
	void deleteEmployee(Integer eno) throws Exception;
	
	void searchEmployee(Integer eno) throws Exception;
	
	void getAllEmployees() throws Exception;
}
