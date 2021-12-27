package co.edureka.ems.configs;

import co.edureka.ems.service.EmployeeService;
import co.edureka.ems.service.EmployeeServiceImpl;

public class ServiceFactory {
	private static EmployeeService empservice;
	
	public static EmployeeService getEmployeeService() throws Exception{
		if(empservice == null)
			empservice = new EmployeeServiceImpl();
		
		return empservice;
	}
}
