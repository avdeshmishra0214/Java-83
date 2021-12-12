package co.edureka.spring.jdbc.dao;

import java.util.List;

import co.edureka.spring.jdbc.entity.Employee;

public interface EmployeeDao {
	Integer saveEmployee(Employee emp);
	
	Integer updateEmployee(Employee emp);
	
	Integer deleteEmployee(Integer eno);
	
	Employee findEmployeeByNo(Integer eno);
	
	List<Employee> findAll();
}
