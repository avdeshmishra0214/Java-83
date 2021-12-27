package co.edureka.web;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/life")
public class Lifecycle extends GenericServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("in init method");
	}

	
	public void destroy() {
		System.out.println("in destroy method");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("in service method");
	}

}
