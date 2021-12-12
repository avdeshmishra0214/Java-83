package co.edureka.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaCustomerServices {
	@GET
	@Produces("text/html")
	public String localCustomerService() {
		String msg = "<h2>Welcome to Edureka Customer Service >>> INDIA</h2>";
		return msg;
	}
	
	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalCustomerService() {
		String msg = "<h2>Welcome to Edureka Customer Service >>> INTERNATIONAL</h2>";
		return msg;
	}	
	
	@GET
	@Produces("text/html")
	@Path("/details/{name}/{course}")
	public String getCourseDetails(@PathParam("name") String custName, @PathParam("course") String courseName) {
		//logic to get course details from DB
		String response = "<h2>Customer Name ---> "+custName+"<br>Course Name ---> "+courseName+"</h2>";
		return response;
	}
	
	@GET
	@Produces("text/html")
	@Path("/enquiry")
	public String getCourseDetailsWithQueryParameter(@QueryParam("name") String custName, @QueryParam("course") String courseName) {
		//logic to get course details from DB
		String response = "<h2>Customer Name - "+custName+"<br>Course Name - "+courseName+"</h2>";
		return response;
	}	
}
