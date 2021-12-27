package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.dto.Employee;

public interface EmployeeDao {
	Integer saveEmployee(Employee emp) throws Exception;
	
	Integer updateEmployee(Employee emp) throws Exception;
	
	Integer deleteEmployee(Integer eno) throws Exception;
	
	Employee findEmployeeByNo(Integer eno) throws Exception;
	
	List<Employee> findAll() throws Exception;
}
