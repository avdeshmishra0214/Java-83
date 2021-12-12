package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("edureka/student")
public class StudentsController {
	@POST
	@Produces("text/html")
	@Path("/register")
	public String registerStudent(@FormParam("name_field") String sName, @FormParam("age_field") Integer sAge, @FormParam("addr_field") String sAddress) {
		//logic to save Student details in DB
		String statusMessage = "<p style=font-size:22px;color:blue>Student Registration Success!<hr>";
		statusMessage += "Student Name : "+sName+"<br>Student Age : "+sAge+"<br>Student Address : "+sAddress+"</p>";
		
		return statusMessage;
	}
}
