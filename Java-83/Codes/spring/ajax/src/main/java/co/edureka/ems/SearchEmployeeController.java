package co.edureka.ems;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.entity.Employee;


public class SearchEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeDao dao;
	
	public void init(ServletConfig config) throws ServletException{
		//initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");
		dao = (EmployeeDao) context.getBean("empdao");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno = request.getParameter("eno");
		Integer empno = Integer.parseInt(eno);
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		Employee emp = dao.findEmployeeByEmpNo(empno);
		//System.out.println(emp);
		if(emp != null) {
			String name = emp.getName();
			float sal = emp.getSal();
			
			JSONObject data = new JSONObject();
			data.put("empname", name);
			data.put("empsal", sal);
			
			out.print(data);
		}else {
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
